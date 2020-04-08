package com.umair.spring.springjdbc2.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.umair.spring.springjdbc2.employee.Employee;
import com.umair.spring.springjdbc2.employeeDoa.employeeDoa;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springjdbc2/test/lcconfig.xml");
		employeeDoa doa = (employeeDoa) context.getBean("employeedao");
		
		/*Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("Maria");
		employee.setLastname("Quais");	*/	
		//int result = doa.create(employee);
		List<Employee> result= doa.read();
		System.out.println("Employee is: "+result);

	}

}
