package in.nadeem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nadeem.service.QouteService;

@RestController
public class QouteRestController {
	/*
	 * it is use for async mean subscribe
	 * 
	 * @Autowired private QouteService qouteService;
	 * 
	 * @GetMapping("/random") public String getRandomQoute() {
	 * qouteService.invokeQouteApi();
	 * 
	 * return "success" ; }
	 */

	@Autowired
	private QouteService qouteService;

	@GetMapping("/random")
	public String getRandomQoute() {
		return qouteService.invokeQouteApi();

		
	}
}
