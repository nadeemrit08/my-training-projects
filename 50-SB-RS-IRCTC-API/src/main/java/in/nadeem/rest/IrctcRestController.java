package in.nadeem.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.request.PassengerRequest;
import in.nadeem.response.TicketResponse; 

@RestController
public class IrctcRestController {

	@PostMapping(value = "/bookticket", consumes = { "application/xml", "application/json" }, produces = {
			"application/xml", "application/json" })
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request) {

		// logic to book ticket

		TicketResponse response = new TicketResponse();
		response.setStatus("CINFIRMED");
		response.setPrice(1500.00);

		BeanUtils.copyProperties(request, response);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
