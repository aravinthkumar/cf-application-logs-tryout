package com.cflog.demo;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;

import com.sap.hcp.cf.logging.servlet.filter.RequestLoggingFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    @Bean
    public FilterRegistrationBean<Filter> loggingFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new RequestLoggingFilter());
        filterRegistrationBean.setName("request-logging");
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        return filterRegistrationBean;
    }

}
