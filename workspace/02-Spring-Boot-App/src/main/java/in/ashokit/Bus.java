package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import in.ashokit.beans.Car;

@Component
public class Bus {
	
	public Bus() {
		System.out.println("Bus :: Constructor");
	}
	
	
	/*@Bean
	public Car getCar() {
		Car c=new Car();
		return c;
	}*/
}
