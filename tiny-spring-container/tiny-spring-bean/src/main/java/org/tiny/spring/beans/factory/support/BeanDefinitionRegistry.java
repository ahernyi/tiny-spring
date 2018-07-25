package org.tiny.spring.beans.factory.support;


import org.tiny.spring.beans.factory.BeanDefinitionStoreException;
import org.tiny.spring.beans.factory.NoSuchBeanDefinitionException;
import org.tiny.spring.beans.factory.config.BeanDefinition;

/**
 * Created by LiuYi on 2018/7/17 17:36
 */
public interface BeanDefinitionRegistry {

    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException;

    void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();
}