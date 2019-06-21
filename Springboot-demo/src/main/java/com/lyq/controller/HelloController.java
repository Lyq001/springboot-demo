package com.lyq.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyq.entity.Resource;
import com.lyq.utils.JsonResult;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "hello springboot!";
	}
	
	//注入资源
	@Autowired
	private Resource resource;
	
	@RequestMapping("getResourceJson")
	@ResponseBody
	public JsonResult getResourceJson() {
		
		Resource bean = new Resource();
		//将resource复制到bean中
		BeanUtils.copyProperties(resource, bean);
		
		return JsonResult.ok(bean);
	}
	

}
