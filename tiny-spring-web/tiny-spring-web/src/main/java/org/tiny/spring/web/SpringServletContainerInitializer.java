package org.tiny.spring.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * Created by LiuYi on 2018/7/23 17:04
 */
public class SpringServletContainerInitializer implements ServletContainerInitializer{

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.print("\n\ndev in...................\n\n");
    }
}