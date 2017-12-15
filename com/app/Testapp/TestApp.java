package com.app.TestApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.java.javaconfig;

class TestApp {

	public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(javaconfig.class);
	Object ob=ctx.getBean("emp");
	System.out.println("\n\t***"+ob);
	}

}
