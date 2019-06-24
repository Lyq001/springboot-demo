package com.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/th")
public class ThymeleafController {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		
		map.addAttribute("name", "测试thymeleaf");
		return "thymeleaf/index";
	}
}
