package com.umair.spring.springjdbc2.employeeDoa;


import java.util.List;

import com.umair.spring.springjdbc2.employee.Employee;

public interface employeeDoa {
	
	int create(Employee employee);
	
	Employee read(int id); 
	
	List<Employee> read();
	
}
