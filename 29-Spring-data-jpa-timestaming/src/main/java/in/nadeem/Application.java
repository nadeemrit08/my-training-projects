package in.nadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nadeem.service.InsurancePlanService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		InsurancePlanService insurancePlanService = context.getBean(InsurancePlanService.class);

		insurancePlanService.savePlan();

		context.close();
	}

}
