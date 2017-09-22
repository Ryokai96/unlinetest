package com.ryoukai.unlinetest.dto;

import com.ryoukai.unlinetest.entity.User;
import com.ryoukai.unlinetest.enums.UserRegisterStateEnum;

public class UserRegisterInfo {
	private String userId;
	private String username;
	private int userType;	//用户类型，0代表管理员，1代表普通用户
	private String email;
	
	private int state;	//注册结果
	private String stateInfo;	//注册结果信息
	
	/**
	 * 注册成功的构造器
	 * @param user
	 */
	public UserRegisterInfo(User user, UserRegisterStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		
		this.userId = user.getUserId();
		this.username = user.getUsername();
		this.userType = user.getUserType();
		this.email = user.getEmail();
	}
	
	/**
	 * 注册失败的构造器
	 */
	public UserRegisterInfo(UserRegisterStateEnum stateEnum) {
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
