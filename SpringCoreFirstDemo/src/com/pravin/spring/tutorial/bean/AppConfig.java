package com.pravin.spring.tutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "myHelloWorldBean")
    public HelloWorld getHelloWorld() {
	return new HelloWorld();
    }
}
