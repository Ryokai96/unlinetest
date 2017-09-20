package com.ryoukai.unlinetest.pojo;

import java.util.HashMap;

/**
 * 试题JavaBeans
 * @author Ryoukai
 *
 */
public class Question {
	private int questionId;	//试题编号
	private String questionType;	//试题类型(SC代表单选题、MC代表多选题、TF代表判断题、FB代表填空题、SA代表简答题)
	private String questionContent;	//问题内容
	private HashMap<String, String> options;	//选项(若为单选题、多选题)
	private String solution;	//试题答案
	private String thinking;	//答题思路
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public HashMap<String, String> getOptions() {
		return options;
	}
	public void setOptions(HashMap<String, String> options) {
		this.options = options;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getThinking() {
		return thinking;
	}
	public void setThinking(String thinking) {
		this.thinking = thinking;
	}
	
}
