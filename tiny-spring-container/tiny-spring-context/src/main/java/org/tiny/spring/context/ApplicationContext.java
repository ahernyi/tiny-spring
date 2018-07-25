package org.tiny.spring.context;

import org.tiny.spring.beans.factory.BeanFactory;
import org.tiny.spring.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by LiuYi on 2018/7/17 15:36
 */
public interface ApplicationContext extends BeanFactory {

    ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException;

}