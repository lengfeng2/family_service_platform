package com.szb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig {

    @Bean
    public WebMvcConfigurer buildConfig(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedHeaders("*")//配置跨域请求头
                        .allowedMethods("*")//配置跨域方法 可以是get post put delete
                        .allowedOrigins("*")//配置跨域请求地址 *代表所有
                        .maxAge(3600)
                        .allowCredentials(true);//设置跨域请求的时候获取同一个 session
            }
        };
    }
}
