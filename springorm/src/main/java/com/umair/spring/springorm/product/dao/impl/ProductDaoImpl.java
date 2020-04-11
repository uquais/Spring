package com.umair.spring.springorm.product.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.umair.spring.springorm.entity.Product;
import com.umair.spring.springorm.product.dao.ProductDao;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernatetemplate;

	@Override
	@Transactional
	public int create(Product product) {
		// Object entity;
		Integer result = (Integer) hibernatetemplate.save(product);

		return result;
	}

}
