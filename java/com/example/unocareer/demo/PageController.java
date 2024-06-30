package com.example.unocareer.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class PageController {
	@Autowired
	public MyRepo a;

	@GetMapping("/test")
	public String my(Model model){
		model.addAttribute("patient",new Patient());
		return "/views/responsive/thymeleaf/patient/test";
	}

	@PostMapping("/result")
	public String getData(@ModelAttribute Patient patient, Model model) {
	    model.addAttribute("patient",patient);
	    a.save(patient);
	    return "/views/responsive/thymeleaf/fragments/common/result";
	}
	
	
	@GetMapping("/display")
	public String displayData(Model model) {
		List<Patient> datalist= a.findAll();
		model.addAttribute("datalist",datalist);
		return "views/responsive/thymeleaf/fragments/common/display";
	}
	
	
	

	
	
	
	

	

}
