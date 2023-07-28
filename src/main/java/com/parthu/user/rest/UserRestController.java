package com.parthu.user.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") Integer id) throws Exception{
		
		if(id==100) {
			return "John";
		}
		else if(id==200) {
			return "Merin";
		}
		else {
			throw new Exception("UserNotFound");
		}
	}
}
