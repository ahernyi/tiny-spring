package org.tiny.spring.context.support;

import org.tiny.spring.context.stereotype.Component;
import org.tiny.spring.context.stereotype.Controller;
import org.tiny.spring.context.stereotype.Repository;
import org.tiny.spring.context.stereotype.Service;
import org.tiny.spring.core.util.TinyStringUtil;

import java.lang.annotation.Annotation;

/**
 * Created by LiuYi on 2018/7/20 15:52
 */
public final class TinyBeanUtil {

    public static String beanName(String className){
        String beanName = className;
        if (className.contains(".")) {
            String[] names = className.split("\\.");
            beanName = names[names.length - 1];
        }
        return TinyStringUtil.captureName(beanName);
    }

    public static boolean hasBean(String beanClass){
        try {
            Class bean = Class.forName(beanClass);
            Annotation[] annotations = bean.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Component
                        || annotation instanceof Controller
                        || annotation instanceof Repository
                        || annotation instanceof Service) {
                    return true;
                }
            }
        } catch (ClassNotFoundException e) {

        }
        return false;
    }
}