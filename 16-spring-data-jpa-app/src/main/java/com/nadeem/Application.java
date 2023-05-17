package com.nadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nadeem.repositries.ContactsMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ContactsMasterRepo bean = context.getBean(ContactsMasterRepo.class);
		System.out.println("it has done " + bean.getClass().getName());
		context.close();
	}

}
