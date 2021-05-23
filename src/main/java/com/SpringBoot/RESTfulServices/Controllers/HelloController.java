package com.SpringBoot.RESTfulServices.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	 @GetMapping("/hello")
	 public String hello()
	 {
		 return "Hello Pratik";
	 }
	
}
