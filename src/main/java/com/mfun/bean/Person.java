package com.mfun.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("====创建 Person");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("====初始化：" + name);
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("====销毁：" + name);
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("====初始化：" + name);
//    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("====设置 name");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("====设置 age");
    }
}
