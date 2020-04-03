package com.mfun.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {

    /**
     * 自定义条件
     * @param context 上下文环境
     * @param metadata 用于获取类或方法上注解的信息，包括所有注解的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取创建 bean 使用的 bean 工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 获取环境信息
        Environment environment = context.getEnvironment();
        // 获取 bean 定义的注册表
        // 通过注册类可以获取到所有注册的 bean 的相关信息，包括还未实例化的 bean
        // 还可以增加和删除 bean 定义
        BeanDefinitionRegistry registry = context.getRegistry();

        // 操作系统是 Windows 才满足条件
        String osName = environment.getProperty("os.name");
        return osName != null && osName.contains("Windows");
    }
}
