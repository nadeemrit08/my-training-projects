package in.nadeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		/* ConfigurableApplicationContext context = */ SpringApplication.run(Application.class, args);

		/*
		 * QuoteClient bean = context.getBean(QuoteClient.class);
		 * 
		 * bean.invokeRandomQuoteApi();
		 */
	}

}
