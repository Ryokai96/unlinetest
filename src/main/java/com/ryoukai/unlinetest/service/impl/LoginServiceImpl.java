package com.ryoukai.unlinetest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryoukai.unlinetest.constant.UserConstant;
import com.ryoukai.unlinetest.constant.UserLoginConstant;
import com.ryoukai.unlinetest.dao.UserDao;
import com.ryoukai.unlinetest.dto.request.UserLoginRequest;
import com.ryoukai.unlinetest.dto.response.UserLoginInfo;
import com.ryoukai.unlinetest.entity.User;
import com.ryoukai.unlinetest.enums.UserLoginStateEnum;
import com.ryoukai.unlinetest.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * 用户登录
	 */
	public UserLoginInfo userLogin(UserLoginRequest userLoginRequest) {
		String username = userLoginRequest.getUsername();
		String password = userLoginRequest.getPassword();
		User user = userDao.selectUserByUsername(username);
		
		UserLoginInfo userLoginInfo = null;
		UserLoginStateEnum userLoginStateEnum = null;
		
		//若未激活
		if(user.getState() == UserConstant.NOACTIVE) {
			userLoginStateEnum = UserLoginStateEnum.stateOf(UserLoginConstant.NO_ACTIVE);
		}
		//若密码错误
		else if(user.getPassword() != password) {
			userLoginStateEnum = UserLoginStateEnum.stateOf(UserLoginConstant.PASSWORD_ERROR);
		}
		//登录成功
		else {
			userLoginStateEnum = UserLoginStateEnum.stateOf(UserLoginConstant.SUCCESS);
		}
		
		userLoginInfo = new UserLoginInfo(userLoginStateEnum);
		
		return userLoginInfo;
	}
	
}
