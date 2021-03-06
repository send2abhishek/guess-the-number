package org.spring.tutorial.config;

import org.spring.tutorial.interceptor.RequestInterceptor;
import org.spring.tutorial.utils.ViewNames;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/").setViewName(ViewNames.HOME);

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new RequestInterceptor());

    }
}
