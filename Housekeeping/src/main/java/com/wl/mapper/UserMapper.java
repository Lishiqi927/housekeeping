package com.wl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.wl.po.User;



@Mapper
public interface UserMapper {
	//查询所有用户
	@Select("select * from user")
	List<User> getAllUsers();
	
	 /***
	  * 登录
	  */
	@Select("select USER_ID,USER_NAME,USER_PHONE,USER_TYPE,USER_AGE from user where USER_NUMBER = #{USERNUMBER} and USER_PASSWORD = #{USERPASSWORD}")
	User getUserLogin(User user);
	/**
	 * 注册
	 */
	@Insert("insert into user (USER_ID,USER_NUMBER,USER_PASSWORD,USER_NAME,USER_PHONE,USER_TYPE,USER_AGE,USER_STATUS) values (#{USERID},#{USERNUMBER},#{USERPASSWORD},#{USERNAME},#{USERPHONE},1,#{USERAGE},1)")
	int registerUser(User user);
	/*
	 * 查询用户名是否存在
	 */
	@Select("select count(1) from user where USER_NUMBER = #{username}")
	int getUserExist(String username);
	//删除数据
	@Delete("delete * from tb_user where id = #{id}")
	void deleteUser(Integer id);
}
