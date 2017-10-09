package com.ryoukai.unlinetest.dto;

/**
 * 用户基本信息封装
 * @author Ryoukai
 *
 */
public class UserInfo {
	private String userId;	//用户ID
	private String username;	//用户名
	private Integer userType;	//用户类型
	private Integer state;	//是否激活
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
}
