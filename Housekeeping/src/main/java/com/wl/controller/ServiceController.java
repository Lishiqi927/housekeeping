package com.wl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wl.po.Service;
import com.wl.service.ServiceService;

@RestController
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	
	//查询所有服务
		@RequestMapping("/getallservice")
		public List<Service> getAllService(){
			List<Service> list = this.serviceService.getAllService();
			System.out.println("list"+list);
			return list;
		}
}
