package com.zehao.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zehao.dubbo.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Override
	public int testAdd(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
