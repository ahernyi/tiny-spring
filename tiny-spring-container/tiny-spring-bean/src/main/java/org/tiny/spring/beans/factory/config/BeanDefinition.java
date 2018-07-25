package org.tiny.spring.beans.factory.config;

/**
 * Created by LiuYi on 2018/7/17 14:51
 */
public interface BeanDefinition {

    Object getBean();

    boolean isSingleton();

    boolean isPrototype();
}