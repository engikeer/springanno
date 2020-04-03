package com.mfun.config;

import com.mfun.bean.Person;
import com.mfun.service.PersonService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 注册 Bean 定义
     * @param importingClassMetadata 获取类上所有注解的信息，包括类型、属性值等
     * @param registry bean 定义的注册表，用于修改注册表中的 bean 定义，影响容器中的 bean（包括未实例化的 bean）
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 注册表相当于 bean
        // 如果注册表中有名为 red 的 bean，移除该 bean 并添加 orange 组件
        if (registry.containsBeanDefinition("red")) {
            registry.removeBeanDefinition("red");
            // 创建一个 bean 定义
            RootBeanDefinition definition = new RootBeanDefinition(Person.class);
            // 注册 bean 定义，参数为 bean 名、bean 定义
            registry.registerBeanDefinition("orange", definition);
        }
    }
}
