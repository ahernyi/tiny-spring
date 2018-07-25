package org.tiny.spring.core.util;

/**
 * Created by LiuYi on 2018/7/20 15:23
 */
public class Assert {

    public static void notEmpty(Object[] array, String message) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(message);
        }
    }
}