package com.nadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactsMasterEntity bean = context.getBean(ContactsMasterEntity.class);
	
		System.out.println(" ++++== " + bean.getClass().getName());
		
		ContactsMasterEntity entity =new ContactsMasterEntity();
		
		entity.getContactId(101);
		entity.getContactName("Nadeem");
		entity.getContactNumber(8);
		ContactsMasterEntity savedEntity =  bean.save(entity);
		System.out.println(savedEntity);
		context.close();
	}

}
