package com.ryoukai.unlinetest.dto;

import java.util.ArrayList;

/**
 * 试卷实体类封装
 * @author Ryoukai
 *
 */
public class TestPaperInfo {
	private Integer testId;	//试卷Id
	private String testType;	//试卷类型
	private String testDesc;	//试卷描述
	private ArrayList<QuestionInfo> questions;
	
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestDesc() {
		return testDesc;
	}
	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}
	public ArrayList<QuestionInfo> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<QuestionInfo> questions) {
		this.questions = questions;
	}
	
}
