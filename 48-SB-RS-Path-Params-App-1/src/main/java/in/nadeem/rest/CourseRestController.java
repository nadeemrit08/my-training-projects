package in.nadeem.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class CourseRestController {

	@GetMapping("/course/{cname}/trainer/{tname}")
	// @GetMapping("/course/{a}/trainer/{b}")
	public String getCourseDetails(@PathVariable /* ("a") */ String cname, @PathVariable /* ("b") */ String tname) {
		String msg = cname + " By " + tname + " Starting From 01-Mar-2023 @8:00 PM IST";
		return msg;
	}
}
