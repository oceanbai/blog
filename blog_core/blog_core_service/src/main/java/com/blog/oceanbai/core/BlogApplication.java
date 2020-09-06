package com.blog.oceanbai.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.oceanbai.blog.dao.mapper")
@SpringBootApplication(scanBasePackages = {"com.blog.oceanbai.common"})
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
