package com.blog.oceanbai.core;

import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@MapperScan("com.blog.oceanbai.core.dao.mapper")
@SpringBootApplication(scanBasePackages = {"com.blog.oceanbai.common","com.blog.oceanbai.core"})
public class BlogApplication implements CommandLineRunner {

    @Resource
    private PageInterceptor pageInterceptor;
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(pageInterceptor);
    }
}
