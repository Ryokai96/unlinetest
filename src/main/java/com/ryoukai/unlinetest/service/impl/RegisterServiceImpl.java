package com.ryoukai.unlinetest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryoukai.unlinetest.constant.UserConstant;
import com.ryoukai.unlinetest.dto.RegisterInfo;
import com.ryoukai.unlinetest.enums.UserRegisterStateEnum;
import com.ryoukai.unlinetest.mapper.UserMapper;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 用户注册
	 */
	public RegisterInfo userRegister(User user) {
		user.setState(UserConstant.ACTIVE);
		user.setUserType(UserConstant.SIMPLE_USER);
		RegisterInfo registerInfo;
		//插入失败
		if(userMapper.insert(user) == 0) {
			registerInfo = new RegisterInfo(UserRegisterStateEnum.USERNAME_EXIST);
		} else {
			registerInfo = new RegisterInfo(user, UserRegisterStateEnum.SUCCESS);
		}
		return registerInfo;
	}

}
