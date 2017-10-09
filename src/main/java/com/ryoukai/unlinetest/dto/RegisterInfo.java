package com.ryoukai.unlinetest.dto;

import com.ryoukai.unlinetest.enums.UserRegisterStateEnum;
import com.ryoukai.unlinetest.pojo.User;

/**
 * 用户注册结果的信息封装
 * @author Ryoukai
 *
 */
public class RegisterInfo {
	private User user;	//用户实体
	private int registerState;	//注册结果
	private String registerStateInfo;	//注册结果信息
	
	/**
	 * 注册失败的构造器
	 */
	public RegisterInfo(UserRegisterStateEnum userRegisterStateEnum) {
		this.registerState = userRegisterStateEnum.getState();
		this.registerStateInfo = userRegisterStateEnum.getStateInfo();
	}
	
	/**
	 * 注册成功的构造器
	 */
	public RegisterInfo(User user, UserRegisterStateEnum userRegisterStateEnum) {
		this.user = user;
		this.registerState = userRegisterStateEnum.getState();
		this.registerStateInfo = userRegisterStateEnum.getStateInfo();
	}

	public User getUser() {
		return user;
	}

	public int getRegisterState() {
		return registerState;
	}

	public String getRegisterStateInfo() {
		return registerStateInfo;
	}
	
}
