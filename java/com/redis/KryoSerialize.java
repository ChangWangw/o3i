package com.redis;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 序列化与反序列化存储和读取Redis数据
 *
 * @author Change
 */
public class KryoSerialize {
    /**
     * 把java对象序列化成byte数组
     *
     * @param object
     * @return
     * @author Change
     */
    public static byte[] serialize(Object object) {
        if (object == null) {
            return null;
        }
        ByteArrayOutputStream baos = null;
        Output output = null;
        try {
            Kryo kryo = new Kryo();
            baos = new ByteArrayOutputStream();
            output = new Output(baos);
            kryo.writeObject(output, object);
            output.flush();
            return baos.toByteArray();
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            output.close();
        }
    }

    /**
     * 把byte数组反序列化得到java对象
     *
     * @param bytes
     * @param clazz
     * @param <T>
     * @return
     * @author change
     */
    public static <T> T unserialize(byte[] bytes, Class<T> clazz) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        Kryo kryo = new Kryo();
        Input input = new Input(bytes);
        T obj = kryo.readObject(input, clazz);
        input.close();
        return obj;
    }
}
