package com.wl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wl.po.UserInfo;

@RestController
public class LoginController {

	@RequestMapping("/login")
	public UserInfo getUser(UserInfo user){
		UserInfo user1 = new UserInfo();
		return user;
	}
}
