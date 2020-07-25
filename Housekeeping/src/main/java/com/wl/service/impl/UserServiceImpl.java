package com.wl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wl.mapper.UserMapper;
import com.wl.po.User;
import com.wl.service.UserService;


@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	//查询所有用户
	public List<User> getAllUsers() {
		
		return this.userMapper.getAllUsers();
	}

	//删除用户
	@CacheEvict(value="UserCache",key="'user.getAllUsers'")
	public void deleteUser(Integer id) {
		System.out.println("删除了id为"+id+"的用户");
		this.userMapper.deleteUser(id);
	}

}
