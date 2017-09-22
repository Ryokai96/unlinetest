package com.ryoukai.unlinetest.enums;

/**
 * 用户注册信息数据字典
 * @author Ryoukai
 *
 */
public enum UserRegisterStateEnum {
	
	SUCCESS(1, "注册成功"),
	USERNAME_EXIST(-1, "用户名已存在");
	
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
