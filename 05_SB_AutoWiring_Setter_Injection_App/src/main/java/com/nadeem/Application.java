package com.nadeem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nadeem.entity.Employee;
import com.nadeem.service.UserService;

@SpringBootApplication
public class Application {

	// ctrl+sft+o to organize the imports
	// ctrl+sft+f to formatre the code
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		UserService userServiceObject = context.getBean(UserService.class);
//		userServiceObject.registerUser();
		Employee emp = context.getBean(Employee.class);
		emp.setId(101);
		emp.setName("Naeem AHmad");
		emp.setAddreess("Kutesra");
		System.out.println("EMp id "+emp.getId());
		System.out.println("EMp name "+emp.getName());
		System.out.println("EMp address "+emp.getAddreess());
		Employee employee=new Employee(201,"Deoband");
		System.out.println("employee id "+employee);
		
	}

}
