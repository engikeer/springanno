package com.mfun;

import com.mfun.bean.Person;
import com.mfun.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    @Test
    void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
