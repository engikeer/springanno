package com.mfun.config;

import com.mfun.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Person person() {
        return new Person("庄颜", 21);
    }
}
