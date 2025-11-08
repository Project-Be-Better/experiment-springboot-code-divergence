package com.example.common.config;

import com.example.common.exception.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class CommonAutoConfiguration {

    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        System.out.println("🚀 Common Starter: GlobalExceptionHandler registered");
        return new GlobalExceptionHandler();
    }
}