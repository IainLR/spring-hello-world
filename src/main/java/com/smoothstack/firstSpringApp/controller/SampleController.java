package com.smoothstack.firstSpringApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(path = "/hello")
	public String ourHello() {
		return "Hello from our test Spring";
	}

}
