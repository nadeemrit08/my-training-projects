package in.nadeem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", "<font color=GREEN size=10>Welcome to my page Good Morning I am a Welcome Page....!!</font>");

		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/greet")
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView displayGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("greetmsg", "<font color=RED size=10>Good Morning I am Greet url request of mvc....!!</font>");
		mav.setViewName("index");
		return mav;
	}
}
