package com.mfun.config;

import com.mfun.bean.Person;
import com.mfun.component.PersonFactory;
import com.mfun.controller.PersonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

//@PropertySource("classpath:pa.properties")
@Configuration
@ComponentScan("com.mfun.service")
public class MyConfig {

    @Bean
    public PersonController pc() {
        return new PersonController();
    }


//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("庄颜");
//        person.setAge(21);
//        System.out.println("person 返回：" + person);
//        return person;
//    }

//    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
//    public PersonFactory person() {
//        PersonFactory personFactory = new PersonFactory();
//        System.out.println("方法返回");
//        return personFactory;
//    }
}
