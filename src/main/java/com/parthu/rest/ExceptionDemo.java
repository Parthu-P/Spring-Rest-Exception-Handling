package com.parthu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionDemo {

	@GetMapping("/msg")
	public String getmsg() {
		String msg="Well come to Rest API......";
		int num=10/0;
		return msg;
	}
}
