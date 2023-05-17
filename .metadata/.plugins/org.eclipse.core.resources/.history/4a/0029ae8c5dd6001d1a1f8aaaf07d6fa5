package in.nadeem.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.nadeem.props.AppPropertires;
import in.nadeem.response.QuoteApiResponse;

@Service
public class QuoteClient {

	@Autowired
	private AppPropertires appPropertires;

	public String invokeRandomQuoteApi() {

		Map<String, String> message = appPropertires.getMessage();
		String apiUrl = message.get("quoteApiUrl");

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

		Map<String, String> message = appPropertires.getMessage();
		String apiUrl = message.get("quoteApiUrl");

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
