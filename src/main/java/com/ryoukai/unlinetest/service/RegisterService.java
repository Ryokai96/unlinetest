package com.ryoukai.unlinetest.service;

import com.ryoukai.unlinetest.dto.RegisterInfo;
import com.ryoukai.unlinetest.pojo.User;

public interface RegisterService {
	
	/**
	 * 用户注册
	 * @param user 用户试题
	 * @return 用户注册结果封装
	 */
	public RegisterInfo userRegister(User user);
}
