package com.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/err")
public class ErrorController {
	
	@RequestMapping("getError")
	public String getError() {
		
		int a =1/0;
		return "thymeleaf/error";
	}
}
