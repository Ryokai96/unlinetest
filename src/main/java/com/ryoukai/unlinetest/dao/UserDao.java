package com.ryoukai.unlinetest.dao;

import com.ryoukai.unlinetest.entity.User;

public interface UserDao {
	/**
	 * 通过用户Id查找User
	 * @param userId 用户Id
	 * @return 用户实例
	 */
	User selectUserById(String userId);
	
	/**
	 * 添加用户
	 * @param user 用户实例
	 */
	void insertUser(User user);
	
	/**
	 * 通过用户Id删除用户
	 * @param userId 用户Id
	 */
	void deleteUser(String userId);
}
