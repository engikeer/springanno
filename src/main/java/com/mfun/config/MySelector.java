package com.mfun.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MySelector implements ImportSelector {

    /**
     * 选择指定的类
     * @param importingClassMetadata 获取类上所有注解的信息，包括类型、属性值等
     * @return 选择的类的全类名
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.mfun.service.PersonService"};
    }
}
