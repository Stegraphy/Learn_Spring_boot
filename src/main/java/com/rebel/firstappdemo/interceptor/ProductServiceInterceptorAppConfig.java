package com.rebel.firstappdemo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//public class ProductServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {   /*此方法中的WebConfigrtAdapter已经过时，因为是基于spring5
//在Spring 5.0 中，已经将 WebMvcConfigurerAdapter 抽象类加上 @Deprecated 注解 记为过时。
@Component
public class ProductServiceInterceptorAppConfig implements WebMvcConfigurer {
    @Autowired
    ProductServiceInterceptor productServiceInterceptor;

    @Override
    public  void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(productServiceInterceptor);
    }
}
