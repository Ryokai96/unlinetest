package com.ryoukai.unlinetest.service;

import com.ryoukai.unlinetest.dto.UserLoginInfo;
import com.ryoukai.unlinetest.pojo.User;

public interface LoginService {
	
	/**
	 * 用户登录
	 * @param user 用户登录信息
	 * @return 用户登陆结果信息
	 */
	UserLoginInfo userLogin(User user);
}
