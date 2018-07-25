package org.tiny.spring.beans.factory;


import org.tiny.spring.core.NestedRuntimeException;

/**
 * Created by LiuYi on 2018/7/17 14:05
 * 微Spring Bean 基本异常
 */
public abstract class BeansException extends NestedRuntimeException {
    public BeansException() {
    }

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}