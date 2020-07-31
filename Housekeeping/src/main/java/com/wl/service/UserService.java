package com.wl.service;

import java.util.List;

import com.wl.po.User;


public interface UserService {
	//查询所有
	List<User> getAllUsers();
	/**
	 * 登录
	 */
	User getUserLogin(User user);
	/*
	 * 注册
	 */
	int registerUser(User user);
	/*
	 * 判断用户名是否存在
	 */
	int getUserExist(String username);
	//删除数据
	void deleteUser(Integer id);
}
