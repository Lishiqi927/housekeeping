package com.wl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wl.po.Service;

@Mapper
public interface ServiceMapper {

	//查询所有用户
		@Select("select SERVICE_ID,USER_ID,TYPE,(select SERVICE_TYPE from dictory where VALUE = TYPE) as TYPETEXT,SERVICE_DAYTIME_STA,SERVICE_DAYTIME_END,SERVICE_DAYTIME_STA1,SERVICE_DAYTIME_END1,SERVICE_DAYTIME_STA2,SERVICE_DAYTIME_END2,SERVICE_DAY_COUNT,MONEY,EXPLAINS,ADDRESS from service")
		List<Service> getAllService();
		
}
