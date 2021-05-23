package com.SpringBoot.RESTfulServices.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.RESTfulServices.Model.UserDetails;

@RestController
public class HelloController {

	 @GetMapping("/hello")
	 public String hello()
	 {
		 return "Hello Pratik";
	 }
	 
	 @GetMapping("/userBean")
	 public UserDetails userBean()
	 {
		 return new UserDetails("Pratik","Ramteke","Chandrapur");
	 }
	
}
