package com.ryoukai.unlinetest.entity;

/**
 * 试卷实体类
 * @author Ryoukai
 *
 */
public class Test {
	private int testId;
	private String testDesc;	//试卷描述
	private String testPath;	//试卷路径
	private String testType;	//试卷类型
	private User user;	//上传者(用户实体)
	
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getTestDesc() {
		return testDesc;
	}
	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}
	public String getTestPath() {
		return testPath;
	}
	public void setTestPath(String testPath) {
		this.testPath = testPath;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
