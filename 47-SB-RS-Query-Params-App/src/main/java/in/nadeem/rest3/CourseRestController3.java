package in.nadeem.rest3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController3 {

	@GetMapping("/course3")
	// public String getCourseDetails(@RequestParam("name") String name) {
	public String getCourseDetails(@RequestParam(value = "name", defaultValue = "SBMS") String name) {
		String msg = "";

		if ("SBMS".equals(name)) {
			msg = "New Batch for SBMS From 31-March-2023 @8:00 PM IST";

		} else if ("JRTP".equals(name)) {
			msg = "New Batch for JRTP From 31-March-2023 @8:00 PM IST";

		} else if ("AWS".equals(name)) {
			msg = "New Batch for AWS From 31-March-2023 @8:00 PM IST";

		} else {
			msg = "Please visit www.ashokit.in for more details";
		}

		return msg;
	}

	@RequestMapping(value = "/fee3", method=RequestMethod.GET )
		public String getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {

		String msg = cname + " By " + tname + " is 5000 INR Only";

		return msg;
	}
}
