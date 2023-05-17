package in.nadeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.nadeem.bindings.Product;

@Controller
public class ProductController {

	@GetMapping("/loadForm")
	public String loadForm(Model model) {
		Product pobj = new Product();
		/*
		 * pobj.setProductId(102); pobj.setProductName("Mouse");
		 * pobj.setProductPrice(800.00);
		 */
		model.addAttribute("product", pobj);

		return "index";
	}

	@PostMapping("/saveProduct")
	public String handleSaveBtnClick(Product product, Model model) {
		System.out.println(product);

		model.addAttribute("msg", "Product Saved Successfully");

		return "dashboard";
	}

}
