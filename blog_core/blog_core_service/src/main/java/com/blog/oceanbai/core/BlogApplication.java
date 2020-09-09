package com.blog.oceanbai.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.blog.oceanbai.core.dao.mapper")
@SpringBootApplication(scanBasePackages = {"com.blog.oceanbai.common","com.blog.oceanbai.core"})
public class BlogApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
