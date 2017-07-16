package edu.viggi.learning.spring.cloud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.viggi.learning.spring.cloud.model.Employee;

@RestController
public class TestController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("harsha");
		emp.setDesignation("java developer");
		emp.setEmpId("123");
		emp.setSalary(6000);
		return emp;
	}

}
