package com.umair.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.umair.spring.springorm.entity.Product;
import com.umair.spring.springorm.product.dao.ProductDao;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext(
				"com/umair/spring/springorm/product/test/lcconfig.xml");

		ProductDao productdao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("its awsm");
		product.setPrice(1200);

		productdao.create(product);
	}

}
