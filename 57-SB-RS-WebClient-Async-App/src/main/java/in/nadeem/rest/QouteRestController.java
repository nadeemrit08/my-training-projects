package in.nadeem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.service.QouteService;

@RestController
public class QouteRestController {
	

	@Autowired
	private QouteService qouteService;

	@GetMapping("/random")
	public String getRandomQoute() {
		return qouteService.invokeQouteApi();

		
	}
}
