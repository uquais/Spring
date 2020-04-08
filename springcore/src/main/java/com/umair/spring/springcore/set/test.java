package com.umair.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels().getClass().getName());

	}

}
