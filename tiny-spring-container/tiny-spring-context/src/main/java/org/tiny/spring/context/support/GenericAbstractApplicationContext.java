package org.tiny.spring.context.support;

import org.tiny.spring.beans.factory.BeanDefinitionStoreException;
import org.tiny.spring.beans.factory.NoSuchBeanDefinitionException;
import org.tiny.spring.beans.factory.config.BeanDefinition;
import org.tiny.spring.beans.factory.config.ConfigurableListableBeanFactory;
import org.tiny.spring.beans.support.DefaultListableBeanFactory;

/**
 * Created by LiuYi on 2018/7/19 16:11
 */
public class GenericAbstractApplicationContext extends AbstractApplicationContext {

    private final DefaultListableBeanFactory beanFactory;

    public GenericAbstractApplicationContext() {
        this.beanFactory = new DefaultListableBeanFactory();
    }

    @Override
    public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
        return beanFactory;
    }

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition tinyBeanDefinition) throws BeanDefinitionStoreException {
        beanFactory.registryBeanDefinition(beanName, tinyBeanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        beanFactory.removeBeanDefinition(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        return beanFactory.getBeanDefinition(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanFactory.containsBeanDefinition(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanFactory.getBeanDefinitionCount();
    }
}