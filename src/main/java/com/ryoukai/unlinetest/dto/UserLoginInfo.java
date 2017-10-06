package com.ryoukai.unlinetest.dto;

import com.ryoukai.unlinetest.enums.UserLoginStateEnum;
import com.ryoukai.unlinetest.pojo.User;

/**
 * 用户登录结果信息封装
 * @author Ryoukai
 *
 */
public class UserLoginInfo {
	private User user;
	private int loginState;
	private String loginStateInfo;
	
	/**
	 * 登录失败的构造器
	 * @param userLoginStateEnum 登录信息
	 */
	public UserLoginInfo(UserLoginStateEnum userLoginStateEnum) {
		this.loginState = userLoginStateEnum.getState();
		this.loginStateInfo = userLoginStateEnum.getStateInfo();
	}
	
	/**
	 * 登录成功的构造器
	 * @param user 用户信息
	 * @param userLoginStateEnum 登录信息
	 */
	public UserLoginInfo(User user, UserLoginStateEnum userLoginStateEnum) {
		this.user = user;
		this.loginState = userLoginStateEnum.getState();
		this.loginStateInfo = userLoginStateEnum.getStateInfo();
	}

	public User getUser() {
		return user;
	}

	public int getLoginState() {
		return loginState;
	}

	public String getLoginStateInfo() {
		return loginStateInfo;
	}

}
