package in.nadeem.bean;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Endpoint(id = "custom_endpoint")
@Component
@Configuration
public class MyCustomEndpoint {

    @ReadOperation
    @Bean
    public String greet() {
        return "Hello from custom endpoint";
    }
}
