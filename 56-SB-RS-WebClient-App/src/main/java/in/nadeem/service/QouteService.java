package in.nadeem.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QouteService {

	/*
	 * public void invokeQouteApi() { String apiUrl =
	 * "https://jsonplaceholder.typicode.com/users/1";
	 * 
	 * its is for async..........
	 * 
	 * WebClient webClient = WebClient.create();
	 * 
	 * webClient.get() .uri(apiUrl) .retrieve() .bodyToMono(String.class)
	 * .subscribe(QouteService::getQuote);
	 * 
	 * System.out.println("*****Request Sent*****");
	 * 
	 * public static void getQuote(String quote) { System.out.println(quote);
	 * 
	 * }
	 * 
	 */

	public String invokeQouteApi() {
		String apiUrl = "https://jsonplaceholder.typicode.com/users/1";
		WebClient webClient = WebClient.create();

		String block = webClient.get().uri(apiUrl).retrieve().bodyToMono(String.class).block();

		System.out.println("*****Request Sent*****");

		return block;

	}

}
