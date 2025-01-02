package com.manavit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.manavit.interceptor.RequestLogInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private RequestLogInterceptor logInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Register the RequestLogInterceptor to intercept all requests
        registry.addInterceptor(logInterceptor);
    }
}
