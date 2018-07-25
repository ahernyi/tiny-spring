package org.tiny.spring.context.annotation;

import org.apache.commons.lang3.StringUtils;
import org.tiny.spring.beans.factory.annotation.AnnotatedGengericBeanDefinition;
import org.tiny.spring.beans.factory.support.BeanDefinitionRegistry;
import org.tiny.spring.core.util.TinyStringUtil;

import java.lang.reflect.Method;

/**
 * Created by LiuYi on 2018/7/17 17:32
 */
public class AnnotatedBeanDefinitionReader {

    private BeanDefinitionRegistry beanDefinitionRegistry;

    public AnnotatedBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;
    }

    public void registry(Class<?>... registryClass) {
        for (Class<?> registry : registryClass) {
            Method[] methods = registry.getMethods();
            if (methods!=null){
                for (Method method : methods){
                    Bean bean = method.getAnnotation(Bean.class);
                    if (bean !=null) {
                        Lazy lazy = method.getAnnotation(Lazy.class);
                        registryBean(method.getReturnType(), null, lazy);
                    }
                }
            }
        }
    }

    private void registryBean(Class<?> registry) {
        registryBean(registry, null, null);
    }

    private void registryBean(Class<?> registry, String beanName) {
        registryBean(registry, beanName, null);
    }

    private void registryBean(Class<?> annotatedClass, String name, Lazy qualifiers){
        AnnotatedGengericBeanDefinition beanDefinition =null;
        try {
            beanDefinition = new AnnotatedGengericBeanDefinition(annotatedClass);
        }catch (Exception e) {
            e.printStackTrace();
        }
        if (qualifiers !=null) {
            beanDefinition.setLazyInit(qualifiers.value());
        }
        if (StringUtils.isEmpty(name)) {
            String[] nameBean = annotatedClass.getName().split("\\.");
            if (nameBean !=null) {
                name = TinyStringUtil.captureName(nameBean[nameBean.length-1]);
            }
        }
        beanDefinitionRegistry.registryBeanDefinition(name, beanDefinition);
    }
}