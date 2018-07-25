package org.tiny.spring.core;

/**
 * Created by LiuYi on 2018/7/17 14:15
 * 微Spring 基本异常
 */
public abstract class NestedRuntimeException extends RuntimeException{

    public NestedRuntimeException() {}

    public NestedRuntimeException(String message) {
        super(message);
    }

    public NestedRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}