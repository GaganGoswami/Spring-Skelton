package com.gtechsoft.skelton.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("hi")
	@ResponseBody
	public String hi() {
		return "Hello, World";
	}

}
