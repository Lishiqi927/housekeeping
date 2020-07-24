package com.wl.service;

import java.util.List;

import com.wl.po.User;


public interface UserService {
	//查询所有
	List<User> getAllUsers();
	//删除数据
	void deleteUser(Integer id);
}
