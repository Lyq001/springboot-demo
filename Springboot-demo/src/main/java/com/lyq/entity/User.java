package com.lyq.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {
	private String name;
	@JsonIgnore 
	//该注释是忽略不显示
	private String password;
	@JsonFormat(pattern = "yyyy-MM-dd",locale = "zh",timezone = "GMT+8")
	//该注释是格式化日期类型，2010-01-01  中国  东八区
	private Date birthday;
	private Integer age;
	@JsonInclude(Include.NON_NULL)
	//该字段是如果值为null，不反回给前台。
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
