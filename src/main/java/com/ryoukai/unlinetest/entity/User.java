package com.ryoukai.unlinetest.entity;

/**
 * 用户实体类
 * @author Ryoukai
 *
 */
public class User {
	private String userId;
	private String username;
	private String password;
	private String email;
	private String code;	//用户激活码
	private int state;	//激活状态，0代表未激活，1代表激活
	private int userType;	//用户类型，0代表管理员，1代表普通用户
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
}
