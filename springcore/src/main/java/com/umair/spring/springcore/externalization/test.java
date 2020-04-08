package com.umair.spring.springcore.externalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springcore/externalization/config.xml");
		myDoa my = (myDoa) context.getBean("properties");
		System.out.println(my);
		
	}

}
