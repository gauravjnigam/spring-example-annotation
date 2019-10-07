package com.gn.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gn.model.Employee;
import com.gn.service.EmpService;

public class EmpClient {
	public static void main(String[] args) {
		
		//EmpService empSvc = new EmpServiceImp();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmpService empSvc = appContext.getBean("empService", EmpService.class);
		List<Employee> empList = empSvc.getAll();
		
		System.out.println(empList);
		
		
	}

}
