package in.nadeem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.request.PassengerRequest;
import in.nadeem.response.TicketResponse;
import in.nadeem.service.TicketService;

@RestController
public class TicketBookingRestController {

	@Autowired
	private TicketService ticketService;

	@PostMapping(value = "/book")
	public TicketResponse bookTicket(@RequestBody PassengerRequest request) {

		return ticketService.initiateTicketBookProcess(request);
	}
}
