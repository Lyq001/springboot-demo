package com.lyq.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyq.entity.User;

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
}
