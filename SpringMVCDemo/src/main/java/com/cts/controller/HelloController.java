package com.cts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String startPage() {
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showFormPage() {
		return "form";
	}
	
	//This is for sending only form data
	@RequestMapping("/processFormType1")
	public String receiveFormData() {
		return "displayFormData";
		
	}
	
	//Here we are requesting the parameter from form
	@RequestMapping("/processFormType2")
	public String receiveFormData(HttpServletRequest request,Model model) {
		String msg="Welcome "+request.getParameter("name").toUpperCase();
		model.addAttribute("message",msg);
		return "displayFormData";
		
	}
	
	@RequestMapping("/processFormType3")
	public String receiveFormData(@RequestParam("name") String myName,Model model) {
		String msg="Hi "+myName.toUpperCase();
		model.addAttribute("greet",msg);
		return "displayFormData";
		
	}

}
