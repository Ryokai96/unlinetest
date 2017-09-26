package com.ryoukai.unlinetest.service;

import com.ryoukai.unlinetest.dto.request.UserLoginRequest;
import com.ryoukai.unlinetest.dto.response.UserLoginInfo;

public interface LoginService {
	
	/**
	 * 用户登录
	 * @param userLoginRequest 用户登录请求封装
	 * @return 用户登录结果
	 */
	UserLoginInfo userLogin(UserLoginRequest userLoginRequest);
}
