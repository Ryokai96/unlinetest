package com.ryoukai.unlinetest.entity;

/**
 * 用户试题库实体类
 * @author Ryoukai
 *
 */
public class SelfTest {
	private int selftestId;
	private Test test;	//试卷实体
	private User user;	//用户实体
	
	public int getSelftestId() {
		return selftestId;
	}
	public void setSelftestId(int selftestId) {
		this.selftestId = selftestId;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
