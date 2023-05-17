package in.nadeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome ")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", " Welcome to Thymeleaf ");
		return "index";

	}
}
