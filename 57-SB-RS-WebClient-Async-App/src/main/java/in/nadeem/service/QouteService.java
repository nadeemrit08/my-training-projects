package in.nadeem.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.nadeem.response.QuoteApiResponse;

@Service
public class QouteService {

	public String invokeQouteApi() {

		String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

		WebClient webClient = WebClient.create();

		 webClient.get()
					.uri(apiUrl)
					.header("Accept", "application/json")
					.retrieve()
					.bodyToMono(QuoteApiResponse.class)
					.subscribe(QouteService::handleResponse);

		System.out.println("*****Request Sent*****");

		return "Success";

	}
	
	public static void handleResponse(QuoteApiResponse resData) {
		System.out.println(resData);
		System.out.println("Response pushed to Apache Kafka........");
	}

}
