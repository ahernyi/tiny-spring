package org.tiny.spring.context.test;

import org.tiny.spring.context.annotation.AnnotationConfigApplicationContext;
import org.tiny.spring.context.ApplicationContext;

/**
 * Created by LiuYi on 2018/7/17 15:15
 */

public class TinyExtend {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TinyApplication.class);
        Object object = applicationContext.getBean("pig");
        System.out.print("\n"+object+"\n");
    }
}