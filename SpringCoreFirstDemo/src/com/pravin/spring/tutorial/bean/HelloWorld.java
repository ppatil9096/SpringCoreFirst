package com.pravin.spring.tutorial.bean;

public class HelloWorld {
    public void sayHello() {
	System.out.println("Hello Spring!!");
    }

    private HelloWorld() {
	System.out.println("Constructor initialization");
    }

    private static HelloWorld helloWorld;

    // Static factory method
    public static HelloWorld getInstance() {
	if (helloWorld == null) {
	    helloWorld = new HelloWorld();
	}
	return helloWorld;
    }

    // Instance factory method
    public HelloWorld createService() {
	return new HelloWorld();
    }
}
