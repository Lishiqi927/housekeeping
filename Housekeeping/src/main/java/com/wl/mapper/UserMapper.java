package com.wl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.wl.po.User;



@Mapper
public interface UserMapper {
	//查询所有用户
	@Select("select * from user")
	List<User> getAllUsers();
	//删除数据
	@Delete("delete * from tb_user where id = #{id}")
	void deleteUser(Integer id);
}
