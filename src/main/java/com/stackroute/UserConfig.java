package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @Configuration
    @ComponentScan({"com.stackroute"})
    public class UserConfig {
        @Bean
        public  InternalResourceViewResolver  viewResolver()
        {
            InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
            viewResolver.setPrefix("/WEB-INF/views/");
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }
    }
