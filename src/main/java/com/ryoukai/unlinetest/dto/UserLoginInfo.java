package com.ryoukai.unlinetest.dto;

import com.ryoukai.unlinetest.entity.User;
import com.ryoukai.unlinetest.enums.UserLoginStateEnum;

/**
 * 封装用户登录信息
 * @author Ryoukai
 *
 */
public class UserLoginInfo {
	private String userId;
	private String username;
	private int userType;	//用户类型，0代表管理员，1代表普通用户
	private String email;
	
	private int state;	//登录结果
	private String stateInfo;	//登录结果信息
	
	/**
	 * 登录成功的构造器
	 * @param user
	 */
	public UserLoginInfo(User user, UserLoginStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		
		this.userId = user.getUserId();
		this.username = user.getUsername();
		this.userType = user.getUserType();
		this.email = user.getEmail();
	}
	
	/**
	 * 登录失败的构造器
	 */
	public UserLoginInfo(UserLoginStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	public String getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public int getUserType() {
		return userType;
	}

	public String getEmail() {
		return email;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
}
