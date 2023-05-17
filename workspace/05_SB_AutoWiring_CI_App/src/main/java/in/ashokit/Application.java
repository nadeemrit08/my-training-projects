package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		/* UserService userService = run.getBean(UserService.class);
		 System.out.println("Start of debugging");
		 userService.registerUser();
		 System.out.println("End of debugging");*/
		
		
	}

}
