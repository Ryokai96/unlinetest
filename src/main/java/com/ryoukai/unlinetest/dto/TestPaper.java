package com.ryoukai.unlinetest.dto;

import java.util.ArrayList;

import com.ryoukai.unlinetest.entity.User;
import com.ryoukai.unlinetest.pojo.Question;

/**
 * 传输试卷实体类
 * @author Ryoukai
 *
 */
public class TestPaper {
	private int testId;
	private String testDesc;	//试卷描述
	private String testType;	//试卷类型
	private User user;	//试卷上传者
	private ArrayList<Question> questions;	//试题
	
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
	public ArrayList<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
}
