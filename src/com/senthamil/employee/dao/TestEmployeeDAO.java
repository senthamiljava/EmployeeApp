package com.senthamil.employee.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.senthamil.employee.model.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Connection.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    dao.addEmployee(new Employee(102,"Amit",35000));  

	}

}
