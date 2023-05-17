package in.nadeem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.service.QuoteClient;

@RestController
public class QuoteRestController {

	@Autowired
	private QuoteClient quoteClient;

	@GetMapping("/quote")
	public String getQoute() {
		// String quote = quoteClient.invokeRandomQuoteApi(); (approach -1)
		String quote = quoteClient.invokeQuoteApi(); // approach - 2
		return quote;
	}

}
