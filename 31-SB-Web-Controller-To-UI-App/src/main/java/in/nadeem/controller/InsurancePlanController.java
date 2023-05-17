package in.nadeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.nadeem.pojo.Plan;
@Controller
public class InsurancePlanController {

	@GetMapping("/plandata")
	@ResponseBody
	public Plan getPlanData() {
		Plan plan = new Plan();
		plan.setPlanId(101);
		plan.setPlanName(" Nadeem Ahmad ");
		plan.setPlanStatus(" Approved ");
		
		
		
		return plan;
	}
}
