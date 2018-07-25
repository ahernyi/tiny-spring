package org.tiny.spring.context.annotation;

import org.tiny.spring.context.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by LiuYi on 2018/7/17 17:09
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
    String value() default "";
}