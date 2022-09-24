package com.cts.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.Student;

@Controller
public class StudentController {

//	This validate and trim the start and end white spaces of a string. If String has only white spaces then trim to null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/form")
	public String showForm(Model model) {
		Student nStudent=new Student();
		model.addAttribute("student", nStudent);
		return "studentForm";
		
	}
	
	@RequestMapping("/processStudent")
	public String processData(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "studentForm";
		}
		else {			
			return "showStudent";
		}
		
	}
	
}
