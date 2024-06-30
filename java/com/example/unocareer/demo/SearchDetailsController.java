package com.example.unocareer.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchDetailsController {
	
	@GetMapping("/search1")
	public String show(Model model) {
		return "/views/responsive/thymeleaf/patient/search";
	}
	
	
	@PostMapping("/search1/result1") 
	public String getDetails(@ModelAttribute Patient result,Model model) { 
		if(result.getFirstname().equals("sai")){
			  result.setLastname("raj");
			  result.setAge("23"); }
			 
			  model.addAttribute("result",result); 
			  return "/views/responsive/thymeleaf/patient/search";
			  }
	
	
	

}
