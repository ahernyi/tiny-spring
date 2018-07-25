package org.tiny.spring.context.annotation;

import org.tiny.spring.context.support.GenericAbstractApplicationContext;

/**
 * Created by LiuYi on 2018/7/17 16:56
 */
public class AnnotationConfigApplicationContext extends GenericAbstractApplicationContext implements AnnotationConfigRegistry {

    private final AnnotatedBeanDefinitionReader reader;

    private final ClassPathBeanDefinitionScanner scanner;

    public AnnotationConfigApplicationContext() {
        reader = new AnnotatedBeanDefinitionReader(this);
        scanner = new ClassPathBeanDefinitionScanner(this);
    }

    public AnnotationConfigApplicationContext(Class<?> application) {
        this();
        registry(application);
    }

    public AnnotationConfigApplicationContext(String... basePackages) {
        this();
        scan(basePackages);
    }

    @Override
    public void registry(Class<?> registryClass) {
        reader.registry(registryClass);
    }

    @Override
    public void scan(String... basePackages) {
        scanner.scan(basePackages);
    }
}