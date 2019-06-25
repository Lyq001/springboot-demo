package com.lyq.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class LyqExceptionHandler {
	//创建error.html异常显示页面
	public static final String ERR_VIEW="error";
	//利用注释获取所有异常
	@ExceptionHandler(value =Exception.class)
	public Object errHandler(HttpServletRequest request,HttpServletResponse response,Exception e) {
		
		e.printStackTrace();
		ModelAndView mView = new ModelAndView();
		mView.addObject("exception", e);
		mView.addObject("url", request.getRequestURI());
		mView.setViewName(ERR_VIEW);
		
		return mView;
	}
}
