package in.nadeem.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.nadeem.response.QuoteApiResponse;

@Service
public class QuoteClient {

	/*
	 * It is for RestTEmplate non parameter
	 * 
	 * public void invokeRandomQuoteApi() {
	 * 
	 * String apiUrl = "https://jsonplaceholder.typicode.com/users/1";
	 * 
	 * RestTemplate rt = new RestTemplate();
	 * 
	 * ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl,
	 * String.class);
	 * 
	 * int statusCode = responseEntity.getStatusCodeValue();
	 * 
	 * if (statusCode == 200) { String body = responseEntity.getBody();
	 * System.out.println(body); }
	 * 
	 * }
	 */

	public String invokeRandomQuoteApi() {

		String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl, String.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			String body = responseEntity.getBody();
			return body;
		}
		return null;

	}

	public String invokeQuoteApi() {

		String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<QuoteApiResponse> responseEntity = rt.getForEntity(apiUrl, QuoteApiResponse.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			QuoteApiResponse body = responseEntity.getBody();
			return body.getCompany().getCatchPhrase().toUpperCase();
		}
		return null;

	}
}
