package com.ryoukai.unlinetest.enums;

/**
 * 登录信息数据字典
 * @author Ryoukai
 *
 */
public enum UserLoginStateEnum {
	SUCCESS(1, "登录成功"),
	PASSWORD_ERROR(-1, "密码错误");
	
	private int state;
	private String stateInfo;
	
	private UserLoginStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	public static UserLoginStateEnum stateOf(int index) {
		for(UserLoginStateEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
