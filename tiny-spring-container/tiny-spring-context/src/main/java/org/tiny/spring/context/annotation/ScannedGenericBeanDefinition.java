package org.tiny.spring.context.annotation;

import org.tiny.spring.beans.support.AbstractBeanDefinition;

/**
 * Created by LiuYi on 2018/7/20 15:30
 */
public class ScannedGenericBeanDefinition extends AbstractBeanDefinition{

    public ScannedGenericBeanDefinition(String className, String beanName) {
        super(beanName);
        try {
            setBeanObject(Class.forName(className).newInstance());
            setBeanClass(Class.forName(className));
        }catch (Exception e){

        }
    }
}