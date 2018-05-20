package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.tutorial.bean.AppConfig;
import com.pravin.spring.tutorial.bean.HelloWorld;

public class MainAppWithAnnotation {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	HelloWorld helloWorldWithAnnotation = applicationContext.getBean("myHelloWorldBean", HelloWorld.class);
	helloWorldWithAnnotation.sayHello();
    }
}
