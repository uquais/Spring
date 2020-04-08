package com.umair.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);

	}

}
