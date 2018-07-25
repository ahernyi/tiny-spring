package org.tiny.spring.context.test;

import org.tiny.spring.context.annotation.Bean;
import org.tiny.spring.context.annotation.Configuration;
import org.tiny.spring.context.annotation.Lazy;

/**
 * Created by LiuYi on 2018/7/17 17:14
 */
@Configuration
public class TinyApplication {

    @Lazy
    @Bean
    public Pig pig(){
        return new Pig("小猪佩奇");
    }
}