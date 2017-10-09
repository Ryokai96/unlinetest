package com.ryoukai.unlinetest.service;

import com.ryoukai.unlinetest.pojo.User;

public interface UserService {
	
	/**
	 * 通过用户ID查找用户信息
	 * @param userId 用户ID
	 * @return 用户信息
	 */
	public User getUserInfoById(String userId);
}
