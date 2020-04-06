package com.mfun;

import com.mfun.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(MyConfig.class)
public class MainTest {

    private ConfigurableApplicationContext applicationContext;

    @Autowired
    public MainTest(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
    void test() {
        System.out.println("===");
        for (String name : applicationContext.getBeanDefinitionNames()) {

            System.out.println(name);
        }
    }

    @Test
    void testProfile() {
        // 1. 调用无参构造器创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 2. 激活环境
        applicationContext.getEnvironment().setActiveProfiles("dev", "test");
        // 3. 注册配置类
        applicationContext.register(MyConfig.class);
        // 4. 刷新容器
        applicationContext.refresh();
        // 5. 使用容器
    }

}
