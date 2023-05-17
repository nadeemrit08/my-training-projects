package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.beans.Car;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.ashokit" , "in.ashokit"} )
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
	}
	@Bean
	public Car getCar() {
		Car c=new Car();
		return c;
	}

}
