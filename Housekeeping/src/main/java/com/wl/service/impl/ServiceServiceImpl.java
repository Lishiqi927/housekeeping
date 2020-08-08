package com.wl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wl.mapper.ServiceMapper;
import com.wl.mapper.UserMapper;
import com.wl.service.ServiceService;

@Transactional
@Service
public class ServiceServiceImpl implements ServiceService{

	
	@Autowired
	private ServiceMapper serviceMapper;
	@Override
	public List<com.wl.po.Service> getAllService() {
		// TODO Auto-generated method stub
		return serviceMapper.getAllService();
	}

}
