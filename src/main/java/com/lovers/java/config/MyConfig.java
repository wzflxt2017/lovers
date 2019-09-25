package com.lovers.java.config;

import com.lovers.java.interceptor.AuthInterceptor;
import com.lovers.java.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> addList=new ArrayList<>();
        List<String> excludeList=new ArrayList<>();



        excludeList.add("/");
        excludeList.add("/index");
        excludeList.add("/login/**");
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(excludeList);
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
    }
}
