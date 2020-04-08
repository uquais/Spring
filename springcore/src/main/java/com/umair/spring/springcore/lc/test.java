package com.umair.spring.springcore.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springcore/lc/lcconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
	}

}
