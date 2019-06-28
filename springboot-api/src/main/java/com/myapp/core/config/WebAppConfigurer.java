package com.myapp.core.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author :zzb
 * @createDate :2019/6/28 17:02
 * @desc :
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Value("${interceptor.configs}")
    private String configs;

    @Bean
    public HandlerInterceptor getTokenInterceptor(){
        return new TokenInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用于排除拦截路径
        registry.addInterceptor(getTokenInterceptor()).addPathPatterns(configs).excludePathPatterns("/test/*");     }
}
