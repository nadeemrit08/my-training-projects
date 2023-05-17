package in.nadeem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.bindings.Customer;

@RestController
public class CustomerRestController {

	@GetMapping(value = "/customer", produces = { "application/json", "application/xml" })
	public Customer getCustomerData() {

		Customer customer = new Customer();

		customer.setCustomerId(101);
		customer.setCustomerName("Nadeem");
		customer.setCustomerPhno(null);

		return customer;

	}

}
