package com.co.ceiba.springaop.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.co.ceiba.springaop.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("SEBAS");
		employeeService.getEmployee().throwException();

		ctx.close();
	}

}
