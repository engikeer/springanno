package com.mfun.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MyTypeFilter implements TypeFilter {

    /**
     * 自定义规则
     * @param metadataReader 用于获取当前类的元信息
     * @param metadataReaderFactory 用于获取其他的类（例如，当前类的超类、接口）的 metadataReader
     * @return 如果匹配则返回 true
     * @throws IOException IO 异常
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类的资源信息（例如，绝对路径）
        Resource resource = metadataReader.getResource();

        return classMetadata.getClassName().contains("Service");
    }
}
