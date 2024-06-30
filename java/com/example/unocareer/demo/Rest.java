package com.example.unocareer.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	@Autowired
	private MyRepo b;

	@GetMapping("/users")
	public List<Patient> getData(){
		return b.findAll();
	}

}
