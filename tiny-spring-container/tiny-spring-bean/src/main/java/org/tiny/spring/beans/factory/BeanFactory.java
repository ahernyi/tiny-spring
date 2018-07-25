package org.tiny.spring.beans.factory;

/**
 * Created by LiuYi on 2018/7/17 14:03
 * 微Spring 基本接口Bean工厂
 * @see org.springframework.beans.factory.BeanFactory 参照
 */
public interface BeanFactory {

    /**
     * 根据bean名称获取bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 根据bean名称和类型获取bean
     * @param beanName
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String beanName, Class<T> requiredType) throws BeansException;

    /**
     * 根据类型获取bean
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(Class<T> requiredType) throws BeansException;

    /**
     * 容器是否存在该bean
     * @param beanName
     * @return
     */
    boolean containsBean(String beanName);

    boolean isSingleton(String beanName) throws NoSuchBeanDefinitionException;
    boolean isPrototype(String beanName) throws NoSuchBeanDefinitionException;
}