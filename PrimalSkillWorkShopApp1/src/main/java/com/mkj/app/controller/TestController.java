package com.mkj.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/ps")
public class TestController {

	public TestController() {
		System.out.println("Rest Component Initilized");
	}
	
	@GetMapping("/test")
	public String testApp()
	{
		return "Test controller of Prime Skill Executes";
	}
	@GetMapping("/test2")
	public String testApp2()
	{
		return "Test2 controller of Prime Skill Executes";
	}
}
