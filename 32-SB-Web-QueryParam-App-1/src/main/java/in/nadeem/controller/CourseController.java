package in.nadeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourseDtls(String cname, String trainer) {

		if (cname.equals("SBMS")) {
			String msg = cname + " By " + trainer + " Almost completed 36 lectures of SBMS";
			return msg;
		} else if (cname.equals("AWS")) {
			String msg = cname + " By " + trainer + "After this I will compeleted Aws";
			return msg;
		}
		return "Contact Admin Team";
	}
}
