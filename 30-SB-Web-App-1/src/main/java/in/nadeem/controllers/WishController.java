package in.nadeem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class WishController {

	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		model.addAttribute("msg", "<font color = GREEN size = 7 >God Bless you...!!! I am Wish Controller</font");

		return "index";
	}
}
