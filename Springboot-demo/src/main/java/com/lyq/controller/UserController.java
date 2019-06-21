package com.lyq.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyq.entity.User;
import com.lyq.utils.JsonResult;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		
		User user =new User();
		user.setName("LIUYAQI");
		user.setPassword("124354656");
		user.setAge(28);		
		user.setBirthday(new Date());
		user.setDesc(null);
		return user;
	}
	
	//使用包装类包装后的json
	@RequestMapping("/getUserJson")
	@ResponseBody
	public JsonResult getUserJson() {
		
		User user =new User();
		user.setName("LIUYAQI");
		user.setPassword("124354656");
		user.setAge(28);		
		user.setBirthday(new Date());
		user.setDesc(null);
		return JsonResult.ok(user);
	}
}
