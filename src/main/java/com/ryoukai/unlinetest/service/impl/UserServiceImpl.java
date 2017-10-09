package com.ryoukai.unlinetest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryoukai.unlinetest.mapper.UserMapper;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.pojo.UserExample;
import com.ryoukai.unlinetest.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * 通过用户ID查找用户信息
	 */
	public User getUserInfoById(String userId) {
		UserExample userExample = new UserExample();
		UserExample.Criteria userCriteria = userExample.createCriteria();
		userCriteria.andUserIdEqualTo(userId);
		List<User> list = userMapper.selectByExample(userExample);
		return list.get(0);
	}

}
