package org.yxt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	
	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("sss");
		return "/hello/success";
	}

}
