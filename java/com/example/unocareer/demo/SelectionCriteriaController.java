package com.example.unocareer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SelectionCriteriaController {
	
	
	 @Autowired 
	 private Selection s;
	 
	
	
	@GetMapping("/info")
	public String findAll(Model model) {
		return "views/responsive/thymeleaf/patient/details";
	}
	
	@PostMapping("/info/find")
	public String view(@ModelAttribute SelectionModel sm,Model model) {
		if(sm.getMobilenumber().isEmpty()) {
			return "views/responsive/thymeleaf/patient/details";
		}
		
		s.save(sm);
		
		return "views/responsive/thymeleaf/patient/details";
	}
	
	

	

}
