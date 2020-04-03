package com.mfun.component;

import com.mfun.bean.Person;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PersonFactory implements FactoryBean<Person> {

    public PersonFactory() {
        System.out.println("创建工厂");
    }

    @Override
    public Person getObject() {
        Person person = new Person();
        person.setName("工厂人");
        person.setAge(1);
        return person;
    }

//    @PreDestroy
    public void destroy() {
        System.out.println("====销毁：");
    }

//    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("====初始化：");
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
