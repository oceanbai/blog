package com.blog.oceanbai.core.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 两个分页插件都配置,不会冲突
 *
 * @author miemie
 * @date 2020/5/29
 */
@Configuration
public class MybatisPlusPageConfig {

    @Resource
    private PageHelperConfig pageHelperConfig;
    /**
     * pagehelper的分页插件
     */
    @Bean
    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }

}
