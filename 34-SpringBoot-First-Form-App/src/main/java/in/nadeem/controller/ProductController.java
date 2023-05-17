package in.nadeem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping(value = { "/", "/loadForm" })
	public String loadForm() {
		return "indexdemo";
	}

	@PostMapping(value = "/saveProduct")
	public String handleSubmitBtn(HttpServletRequest req, Model model) {
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		String price = req.getParameter("price");

		System.out.println(" Product ID : " + pid);
		System.out.println(" Product Name : " + pname);
		System.out.println(" Product Price : " + price);

		// logic to save form data

		model.addAttribute("msg", "Product save to Catalog Successfully...!!!");
		return "success";
	}
}
