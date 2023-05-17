package in.nadeem;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	
		//java-8 approach to work with runner
		ApplicationRunner applicationRunner = (obj) -> {
			System.out.println("I am from application runner :: Using Lamda Expresion...");
		};
	
		applicationRunner.run(null);
	}

}
