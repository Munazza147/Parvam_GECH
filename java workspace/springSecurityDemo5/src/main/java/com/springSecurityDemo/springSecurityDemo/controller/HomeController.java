package com.springSecurityDemo.springSecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springSecurityDemo.springSecurityDemo.DTO.StudentDTO;

@Controller
public class HomeController {
	
	@GetMapping({"/",""})
	public String home() {
		return "home";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("studentDTO",studentDTO);
		return "register";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute StudentDTO studentDTO, RedirectAttributes redirectAttributes) {
		studentService.storeStudent(studentDTO);
		redirectAttributes.addFlashAttribute("success","Student saved succesfully");
		return "redirect:/login";
	}
	@GetMapping("/std-details")
	public String std(){
		return "std-details";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}