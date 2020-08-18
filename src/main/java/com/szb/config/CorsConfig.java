package com.szb.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //配置跨域请求头，*配置所有请求
        corsConfiguration.addAllowedHeader("*");
        //所有地址都可以访问
        corsConfiguration.addAllowedOrigin("*");
        //配置跨域请求方法
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //配置 可以访问的地址
        source.registerCorsConfiguration("/**",buildConfig());
        return new CorsFilter();
    }

}
