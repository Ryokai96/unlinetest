package com.ryoukai.unlinetest.enums;

import com.ryoukai.unlinetest.constant.UserRegisterConstant;

/**
 * 用户注册信息数据字典
 * @author Ryoukai
 *
 */
public enum UserRegisterStateEnum {
	
	SUCCESS(UserRegisterConstant.SUCCESS, "注册成功"),
	USERNAME_EXIST(UserRegisterConstant.USERNAME_REPEAT, "用户名已存在");
	
	private int state;
	private String stateInfo;
	
	private UserRegisterStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	public static UserRegisterStateEnum stateOf(int index) {
		for(UserRegisterStateEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
