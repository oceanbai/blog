package com.blog.oceanbai.core.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author bby15929
 * @date 2020年09月09日18:20:00
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "blog.pagehelper")
public class PageHelperConfig {

    private String helperDialect;

    private String reasonable;

    private String supportMethodsArguments;

    private String params;
}
