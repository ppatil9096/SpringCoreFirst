package com.pravin.spring.tutorial.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.tutorial.bean.HelloWorld;

/**
 * 
 * @author ppp
 * @desc Spring 4 first demo
 */
@SuppressWarnings("deprecation")
public class MainApp {

    public static void main(String[] args) {
	Resource resource = new ClassPathResource("beans.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	HelloWorld beanFactoryInstance = (HelloWorld) beanFactory.getBean("helloWorld");
	beanFactoryInstance.sayHello();
	System.out.println("================");
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	HelloWorld applicationContextInstance1 = (HelloWorld) applicationContext.getBean("helloWorld");
	/**
	 * initialization using constructor
	 */
	HelloWorld applicationContextInstance2 = applicationContext.getBean("helloWorld", HelloWorld.class);
	applicationContextInstance1.sayHello();
	System.out.println("================");
	applicationContextInstance2.sayHello();
	System.out.println("================");
	/**
	 * initialization using Static Factory method
	 */
	HelloWorld applicationContextStaticGetInstance = applicationContext.getBean("myService", HelloWorld.class);
	applicationContextStaticGetInstance.sayHello();
	System.out.println("================");

	/**
	 * initialization using Instance Factory method
	 */
	HelloWorld applicationContextGetInstance = applicationContext.getBean("myInstanceService", HelloWorld.class);
	applicationContextGetInstance.sayHello();

    }
}
