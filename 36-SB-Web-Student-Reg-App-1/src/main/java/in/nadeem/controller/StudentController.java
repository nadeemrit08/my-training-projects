package in.nadeem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.nadeem.bindings.Student;
import in.nadeem.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {

		model.addAttribute("genders", studentService.getGenders());
		model.addAttribute("courses", studentService.getCourses());
		model.addAttribute("timings", studentService.getTimings());

		Student sobj = new Student();

		model.addAttribute("student", sobj);

		return "index";
	}

	@PostMapping("/saveStudent")
	public String handleRegBtnClick(Student student, Model model) {

		System.out.println(student);

		model.addAttribute("msg", "Student Registered Successfully And Happily....!!!");
		
		
		return "dashboard";
	}

}
