package org.tiny.spring.context.annotation;

import java.lang.annotation.*;

/**
 * Created by LiuYi on 2018/7/18 17:19
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Lazy {
    /**
     * Whether lazy initialization should occur.
     */
    boolean value() default true;
}