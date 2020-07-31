package com.wl.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wl.po.User;
import com.wl.service.impl.UserServiceImpl;

@RestController
public class LoginController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public User getUser(User user){

		User user1 = userServiceImpl.getUserLogin(user);
		return user1;
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public int registerUser(User user){
		String id = UUID.randomUUID().toString();
		user.setUSERID(id);
		int status = userServiceImpl.registerUser(user);
		return status;
	}
	
}
