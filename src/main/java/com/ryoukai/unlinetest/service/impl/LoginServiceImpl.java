package com.ryoukai.unlinetest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryoukai.unlinetest.constant.UserConstant;
import com.ryoukai.unlinetest.dto.UserLoginInfo;
import com.ryoukai.unlinetest.enums.UserLoginStateEnum;
import com.ryoukai.unlinetest.mapper.UserMapper;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.pojo.UserExample;
import com.ryoukai.unlinetest.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * 用户登录
	 */
	public UserLoginInfo userLogin(User user) {
		UserExample userExample = new UserExample();
		UserExample.Criteria userCriteria = userExample.createCriteria();
		//先查询用户是否存在
		userCriteria.andUsernameEqualTo(user.getUsername());
		List<User> users = userMapper.selectByExample(userExample);
		UserLoginInfo userLoginInfo;
		//用户不存在
		if(users.size() == 0) {
			userLoginInfo = new UserLoginInfo(UserLoginStateEnum.USER_NOT_EXIST);
			return userLoginInfo;
		}
		//查询用户名与密码是否匹配
		userCriteria.andPasswordEqualTo(user.getPassword());
		users = userMapper.selectByExample(userExample);
		//密码错误
		if(users.size() == 0) {
			userLoginInfo = new UserLoginInfo(UserLoginStateEnum.PASSWORD_ERROR);
			return userLoginInfo;
		}
		//用户未激活
		if(users.get(0).getState() == UserConstant.NOACTIVE) {
			userLoginInfo = new UserLoginInfo(UserLoginStateEnum.NO_ACTIVE);
			return userLoginInfo;
		}
		//登录成功
		userLoginInfo = new UserLoginInfo(user, UserLoginStateEnum.SUCCESS);
		return userLoginInfo;
	}
	
}
