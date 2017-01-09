package com.senthamil.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.senthamil.employee.model.Employee;

public class EmployeeDAO {
  JdbcTemplate jdbctemplate;

public EmployeeDAO(JdbcTemplate jdbctemplate) {
	super();
	this.jdbctemplate = jdbctemplate;
}
public void addEmployee(Employee e)
{
	String query="insert into employee(id,name,salary) values(?,?,?)";
	int rows=jdbctemplate.update(query);
	System.out.println("number of row inserted "+rows);
}
  
}
