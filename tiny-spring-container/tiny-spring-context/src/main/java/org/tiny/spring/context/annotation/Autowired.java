package org.tiny.spring.context.annotation;

/**
 * Created by LiuYi on 2018/7/19 15:55
 */
public @interface Autowired {

    boolean required() default true;
}