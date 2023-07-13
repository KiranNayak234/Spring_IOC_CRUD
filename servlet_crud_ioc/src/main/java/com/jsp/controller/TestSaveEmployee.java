package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;
import com.jsp.util.MyConfig;

public class TestSaveEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("kiran");
		employee.setPhone(988776543);
		employee.setSal(54000);
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeService");
		Employee employee2= employeeService.saveEmployee(employee);
		if(employee2!=null) {
			System.out.println("data saved");
		}
		else {
			System.out.println("please check the data");
		}

	}

}