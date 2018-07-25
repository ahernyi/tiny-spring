package org.tiny.spring.context.stereotype;

import java.lang.annotation.*;

/**
 * Created by LiuYi on 2018/7/17 17:11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

    String value() default "";
}