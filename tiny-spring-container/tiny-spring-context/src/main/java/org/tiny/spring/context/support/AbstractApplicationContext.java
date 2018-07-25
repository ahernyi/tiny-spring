package org.tiny.spring.context.support;


import org.tiny.spring.beans.factory.BeansException;
import org.tiny.spring.beans.factory.NoSuchBeanDefinitionException;
import org.tiny.spring.beans.factory.config.ConfigurableListableBeanFactory;
import org.tiny.spring.beans.factory.support.BeanDefinitionRegistry;
import org.tiny.spring.context.ConfigurableApplicationContext;

/**
 * Created by LiuYi on 2018/7/17 14:55
 */
public abstract class AbstractApplicationContext implements ConfigurableApplicationContext, BeanDefinitionRegistry {

    public Object getBean(String beanName) throws BeansException {
        return getBeanFactory().getBean(beanName);
    }

    public <T> T getBean(String beanName, Class<T> requiredType) throws BeansException {
        return null;
    }

    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    public boolean containsBean(String beanName) {
        return getBeanFactory().containsBean(beanName);
    }

    public boolean isSingleton(String beanName) throws NoSuchBeanDefinitionException {
        return getBeanFactory().isSingleton(beanName);
    }

    public boolean isPrototype(String beanName) throws NoSuchBeanDefinitionException {
        return getBeanFactory().isPrototype(beanName);
    }

    @Override
    public abstract ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException ;

    @Override
    public void refresh() {

    }


}