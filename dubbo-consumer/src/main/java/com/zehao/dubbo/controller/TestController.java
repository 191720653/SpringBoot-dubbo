package com.zehao.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zehao.dubbo.service.ITestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Reference
	private ITestService iTestService;
	
	@RequestMapping("/add")
	public Object test(int a, int b) {
		return iTestService.testAdd(a, b);
	}

}
