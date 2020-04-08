package com.umair.spring.springjdbc2.employeeDoa.Impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.umair.spring.springjdbc2.employee.Employee;
import com.umair.spring.springjdbc2.employeeDoa.employeeDoa;
import com.umair.spring.springjdbc2.employeeDoa.rowmapper.EmployeeRowMapper;

public class EmployeeImpl implements employeeDoa{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		
		String sql ="insert into employee values (?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql= "select * from employee where id =?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> query = jdbcTemplate.query(sql, rowMapper);
	
		
		return query;
	}
	

}
