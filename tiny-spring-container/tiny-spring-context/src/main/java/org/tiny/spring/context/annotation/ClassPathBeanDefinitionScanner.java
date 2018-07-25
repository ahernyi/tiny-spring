package org.tiny.spring.context.annotation;

import org.tiny.spring.beans.factory.config.BeanDefinitionHolder;
import org.tiny.spring.beans.factory.support.BeanDefinitionRegistry;
import org.tiny.spring.context.support.TinyBeanUtil;
import org.tiny.spring.core.util.Assert;
import org.tiny.spring.core.util.TinyClassUtil;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by LiuYi on 2018/7/20 15:09
 */
public class ClassPathBeanDefinitionScanner {
    private BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.registry = beanDefinitionRegistry;
    }

    public int scan(String[] basePackages) {
        Assert.notEmpty(basePackages, "At least one base package must be specified");
        int beanCountAtScanStart = this.registry.getBeanDefinitionCount();

        doScan(basePackages);
        return 0;
    }

    protected Set<BeanDefinitionHolder> doScan(String... basePackages){
        Set<BeanDefinitionHolder> holder = new LinkedHashSet<>();
        for (String basePackage : basePackages) {
            List<String> beanClass =  TinyClassUtil.environmentBeanClassName(basePackage);
            if (beanClass == null || beanClass.size() == 0) {
                continue;
            }
            for (String className : beanClass){
                if (!TinyBeanUtil.hasBean(className))continue;
                ScannedGenericBeanDefinition beanDef = new ScannedGenericBeanDefinition(className, TinyBeanUtil.beanName(className));
                holder.add(new BeanDefinitionHolder(beanDef, beanDef.getBeanName(), null));
                registry.registryBeanDefinition(beanDef.getBeanName(), beanDef);
            }
        }
        return holder;
    }


}