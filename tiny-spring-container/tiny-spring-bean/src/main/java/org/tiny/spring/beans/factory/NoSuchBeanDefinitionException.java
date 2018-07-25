package org.tiny.spring.beans.factory;

/**
 * Created by LiuYi on 2018/7/17 14:29
 */
public class NoSuchBeanDefinitionException extends BeansException {

    private String beanName;

    public NoSuchBeanDefinitionException() {}

    public NoSuchBeanDefinitionException(String beanName) {
        super("tiny no bean name " + beanName + " available");
        this.beanName = beanName;
    }

    public NoSuchBeanDefinitionException(String beanName, String message) {
        super("tiny no bean name " + beanName + " available: " + message);
        this.beanName = beanName;
    }

    public NoSuchBeanDefinitionException(String beanName, Throwable cause) {
        super("tiny no bean name " + beanName + " available", cause);
        this.beanName = beanName;
    }
}