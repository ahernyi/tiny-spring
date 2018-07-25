package org.tiny.spring.beans.factory.annotation;

import org.tiny.spring.beans.support.AbstractBeanDefinition;

/**
 * Created by LiuYi on 2018/7/18 16:57
 */
public class AnnotatedGengericBeanDefinition extends AbstractBeanDefinition {

    public AnnotatedGengericBeanDefinition(Class<?> beanClass) throws IllegalAccessException, InstantiationException {
        super(beanClass.getName());
        setBeanClass(beanClass);
        setBeanObject(beanClass.newInstance());
    }
}