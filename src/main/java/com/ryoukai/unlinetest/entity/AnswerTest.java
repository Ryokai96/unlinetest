package com.ryoukai.unlinetest.entity;

/**
 * 用户答题实体类
 * @author Ryoukai
 *
 */
public class AnswerTest {
	private int answertestId;
	private Test test;	//试卷实体
	private User user;	//答题人(用户)实体
	private String answertestPath;	//答题文件路径
	private int state;	//答题状态(0代表未提交，1代表已提交)
	
	public int getAnswertestId() {
		return answertestId;
	}
	public void setAnswertestId(int answertestId) {
		this.answertestId = answertestId;
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
	public String getAnswertestPath() {
		return answertestPath;
	}
	public void setAnswertestPath(String answertestPath) {
		this.answertestPath = answertestPath;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
