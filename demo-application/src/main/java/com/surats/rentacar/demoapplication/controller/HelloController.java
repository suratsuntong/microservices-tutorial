package com.surats.rentacar.demoapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value="/hello")
	public String greeting() {
		return "Hello Springboot!";
	}
}
