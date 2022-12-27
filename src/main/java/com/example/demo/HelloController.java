package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "I don't have a DataBase right now. Sorry!";
	}

}