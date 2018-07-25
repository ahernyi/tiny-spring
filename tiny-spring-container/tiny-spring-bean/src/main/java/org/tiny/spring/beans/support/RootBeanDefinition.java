package org.tiny.spring.beans.support;

/**
 * Created by LiuYi on 2018/7/17 14:53
 */
public class RootBeanDefinition extends AbstractBeanDefinition {

    public RootBeanDefinition(Class<?> beanClass) {
        super();
        setBeanClass(beanClass);
    }
}