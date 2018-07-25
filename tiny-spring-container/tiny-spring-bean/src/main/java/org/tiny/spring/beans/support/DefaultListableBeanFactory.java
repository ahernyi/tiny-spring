package org.tiny.spring.beans.support;

import org.tiny.spring.beans.factory.BeanDefinitionStoreException;
import org.tiny.spring.beans.factory.BeansException;
import org.tiny.spring.beans.factory.NoSuchBeanDefinitionException;
import org.tiny.spring.beans.factory.config.BeanDefinition;
import org.tiny.spring.beans.factory.config.ConfigurableListableBeanFactory;
import org.tiny.spring.beans.factory.support.BeanDefinitionRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LiuYi on 2018/7/17 14:55
 */
public class DefaultListableBeanFactory implements ConfigurableListableBeanFactory, BeanDefinitionRegistry {

    /** Map of bean definition objects, keyed by bean name */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);

    public Object getBean(String beanName) throws BeansException {
        if (beanDefinitionMap.containsKey(beanName)){
            return beanDefinitionMap.get(beanName).getBean();
        }
        return null;
    }

    public <T> T getBean(String beanName, Class<T> requiredType) throws BeansException {
        return null;
    }

    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    public boolean containsBean(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    public boolean isSingleton(String beanName) throws NoSuchBeanDefinitionException {
        if (!containsBean(beanName)) {
            throw new NoSuchBeanDefinitionException(beanName);
        }
        return beanDefinitionMap.get(beanName).isSingleton();
    }

    public boolean isPrototype(String beanName) throws NoSuchBeanDefinitionException {
        if (!containsBean(beanName)) {
            throw new NoSuchBeanDefinitionException(beanName);
        }
        return beanDefinitionMap.get(beanName).isPrototype();
    }


    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }
}