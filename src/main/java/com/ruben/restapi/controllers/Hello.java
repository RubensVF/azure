package com.ruben.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 */
@RestController

public class Hello {

	@GetMapping("/hello")
	public String hello(@RequestParam String name){
		String res = name!=null?name:"crack";
		return "hello"+res;
	}
	
}
