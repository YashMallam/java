package com.example.unocareer.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
	
	@RequestMapping("/test")
	public String getData() {
		return "/views/responsive/thymeleaf/patient/patientmanage";
	}
	@RequestMapping("/test2")
	public String my(){
		return "/views/responsive/thymeleaf/patient/test";
	}
	
	

}
