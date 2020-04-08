package com.umair.spring.springjdbc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/umair/spring/springjdbc2/lcconfig.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values (?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(1),"Umair","Quais"); 
		System.out.println("number of result inserted "+result);

	}

}
