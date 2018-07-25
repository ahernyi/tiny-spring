package org.tiny.spring.context.annotation;

/**
 * Created by LiuYi on 2018/7/17 18:00
 */
public interface AnnotationConfigRegistry {

    void registry(Class<?> registryClass);

    void scan(String... basePackages);
}