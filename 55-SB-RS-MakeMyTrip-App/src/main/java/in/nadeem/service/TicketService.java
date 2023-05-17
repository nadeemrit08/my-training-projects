package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.nadeem.request.PassengerRequest;
import in.nadeem.response.TicketResponse;

@Service
public class TicketService {

	@Autowired
	RestTemplate rt = new RestTemplate();

	public TicketResponse initiateTicketBookProcess(PassengerRequest requestData) {

		String endpointUrl = "http://localhost:9090/bookticket";

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Accept", "application/json");

		HttpEntity<PassengerRequest> request = new HttpEntity<>(requestData, headers);

		/*
		 * some about autowired annotation RestTemplate rt = new RestTemplate();
		 * 
		 * 
		 * 
		 */

		/*
		 * 
		 * 
		 * For by default headers 
		 * 
		 * ResponseEntity<TicketResponse> postForEntity =
		 * rt.postForEntity(endpointUrl, requestData, TicketResponse.class);
		 * 
		 * 
		 */

		/*
		 * 
		 * to create headers ourself we need to create header object it is use only for
		 * 
		 * httppost request ResponseEntity<TicketResponse> postForEntity =
		 * rt.postForEntity(endpointUrl, request, TicketResponse.class);
		 * 
		 * 
		 */

		// we can use it for postForEntity but we not
		// it is use for all type of http request
		ResponseEntity<TicketResponse> postForEntity = rt.exchange(endpointUrl, HttpMethod.POST, request,
				TicketResponse.class);

		TicketResponse body = postForEntity.getBody();

		return body;
	}
}
