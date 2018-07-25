package org.tiny.spring.context.annotation;

import java.lang.annotation.*;

/**
 * Created by LiuYi on 2018/7/17 17:15
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bean {

}