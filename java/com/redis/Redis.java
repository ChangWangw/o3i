package com.redis;


import com.jc.model.TbUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.servlet.http.HttpSession;

/**
 * @author Change
 */
public class Redis {

    private static String redisUrl = "127.0.0.1";
    private static int redisPort = 6379;
    private static String redisPassword = null;
    // 可选0-15
    private static int database = 1;

    private static final Logger logger = LoggerFactory.getLogger(Redis.class);

    private static volatile JedisPool jedisPool = null;

    private Redis() {
    }

    /**
     * 服务器整个应用关闭后（不是单个方法结束后），可考虑调用此方法销毁连接池
     *
     * @author LAN
     */
    public static void destroy() {
        if (jedisPool == null) {
            return;
        }
        if (!jedisPool.isClosed()) {
            jedisPool.close();
        }
        jedisPool.destroy();
    }

    private static Jedis getConnection() {
        if (jedisPool == null) {
            // 线程安全
            synchronized (Redis.class) {
                if (jedisPool == null) {
                    logger.debug("=================创建jedisPool Start=================");
                    JedisPoolConfig config = new JedisPoolConfig();
                    //最大连接数, 默认8个
                    config.setMaxTotal(200);
                    //最大空闲连接数, 默认8个
                    config.setMaxIdle(8);
                    //获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
                    config.setMaxWaitMillis(1000 * 100);
                    config.setTestOnBorrow(true);

                    jedisPool = new JedisPool(config, redisUrl, redisPort, 100000, redisPassword, database);
                    logger.debug("=================创建jedisPool End=================");
                }
            }
        }
        return jedisPool.getResource();
    }

    /**
     * @param key    存储的键
     * @param o      存储的java对象
     * @param expire 设置过期时间,单位：秒，小于0时为永不过期
     * @author Change
     */
    public static void set(String key, Object o, int expire) {
        Jedis jedis = null;
        try {
            jedis = getConnection();
            if (o == null) {
                jedis.del(key.getBytes());
                return;
            }
            byte[] data = KryoSerialize.serialize(o);
            if (expire > 0) {
                jedis.setex(key.getBytes(), expire, data);
            } else {
                jedis.set(key.getBytes(), data);
            }
        } finally {
            //新版本的close方法，如果是从JedisPool中取出的，则会放回到连接池中，并不会销毁。
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static void set(String key, Object o) {
        set(key, o, -1);
    }

    public static <T> T get(String key, Class<T> clazz) {
        Jedis jedis = null;
        try {
            jedis = getConnection();
            byte[] data = jedis.get(key.getBytes());
            if (data == null || data.length == 0) {
                return null;
            }
            T t = (T) KryoSerialize.unserialize(data, clazz);
            return t;
        } finally {
            //新版本的close方法，如果是从JedisPool中取出的，则会放回到连接池中，并不会销毁。
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public static String sessionEnd(HttpSession session, TbUser tbUser) {
        try (Jedis jedis = getConnection()) {
            jedis.del(tbUser.getId() + "");
            session.getAttribute("user");
            session.removeAttribute("user");
            session.getAttribute("user");
            return "true";
        } catch (Exception e) {
            System.out.println("删除失败");
            return "false";
        }
        //新版本的close方法，如果是从JedisPool中取出的，则会放回到连接池中，并不会销毁。
    }

}
