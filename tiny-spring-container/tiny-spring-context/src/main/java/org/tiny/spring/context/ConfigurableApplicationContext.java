package org.tiny.spring.context;

/**
 * Created by LiuYi on 2018/7/19 16:00
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    void refresh();
}