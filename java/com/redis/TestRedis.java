package com.redis;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Properties;

/**
 * @author Change
 */
public class TestRedis {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        String localUname = map.get("USERNAME");
        System.out.println(localUname);
        // 获取用户名
        Properties prop = System.getProperties();
        System.out.println("\n当前用户名:" + prop.getProperty("user.name"));
        System.out.println(prop.getProperty("user.password"));
        System.out.println("\n当前系统:" + prop.getProperty("os.name"));
        System.out.println("\n当前系统:" + prop.getProperty("os.password"));
//        这2中方式都是获取服务器上的用户名，我怎么从HttpServletRequest中获取
    }
}
