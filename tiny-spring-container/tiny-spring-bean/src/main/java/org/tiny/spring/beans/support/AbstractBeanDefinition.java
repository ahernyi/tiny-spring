package org.tiny.spring.beans.support;

import org.tiny.spring.beans.factory.config.BeanDefinition;

/**
 * Created by LiuYi on 2018/7/18 16:26
 */
public abstract class AbstractBeanDefinition implements BeanDefinition {

    //bean 名
    private final String beanName;

    public static final String SCOPE_DEFAULT = "singleton";

    private String scope = SCOPE_DEFAULT;

    private boolean lazyInit = false;

    private volatile Object beanClass;

    private volatile Object beanObject;

    private String[] dependsOn;

    private boolean primary = false;

    public AbstractBeanDefinition() {
        this(null);
    }

    public AbstractBeanDefinition(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public Object getBean() {
        return beanObject;
    }

    @Override
    public boolean isSingleton(){
        return scope.equals(SCOPE_DEFAULT) || SCOPE_DEFAULT.equals(scope);
    }

    @Override
    public boolean isPrototype() {
        return !isSingleton();
    }

    public Object getBeanObject() {
        return beanObject;
    }

    public void setBeanObject(Object beanObject) {
        this.beanObject = beanObject;
    }

    public String getBeanName() {
        return beanName;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public Object getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Object beanClass) {
        this.beanClass = beanClass;
    }

    public String[] getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(String[] dependsOn) {
        this.dependsOn = dependsOn;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
}