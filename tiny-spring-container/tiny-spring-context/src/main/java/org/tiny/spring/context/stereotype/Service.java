package org.tiny.spring.context.stereotype;

import java.lang.annotation.*;

/**
 * Created by LiuYi on 2018/7/17 17:12
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Service {
    String value() default "";
}