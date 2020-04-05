package com.mfun;

import com.mfun.bean.Person;
import com.mfun.component.PersonFactory;
import com.mfun.config.MyConfig;
import com.mfun.controller.PersonController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Iterator;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = MyConfig.class)
@SpringJUnitConfig(MyConfig.class)
public class MainTest {

    private ConfigurableApplicationContext applicationContext;

    @Autowired
    public MainTest(ConfigurableApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
    void test() {
//        System.out.println(applicationContext.getBean("personController"));
        System.out.println(applicationContext.getBean("pc"));
    }

//    @Test
//    void testFactoryBean() {
//        // 获取工厂 bean 的产品：getObject 的返回值
//        System.out.println(applicationContext.getBean("person"));
////        // 获取工厂 bean 本身
//        System.out.println(applicationContext.getBean("&person"));
//        System.out.println(applicationContext.getBean(Person.class));
//        System.out.println(applicationContext.getBean(PersonFactory.class));
//        String[] names = applicationContext.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//    }
}
