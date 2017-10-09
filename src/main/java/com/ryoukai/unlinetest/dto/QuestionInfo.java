package com.ryoukai.unlinetest.dto;

import java.util.HashMap;

/**
 * 试题实体封装
 * @author Ryoukai
 *
 */
public class QuestionInfo {
	private Integer questionId;	//试题Id
	private String questionType;	//试题类型，SC代表单选题，MC代表多选题
	private String questionContent;	//试题内容
	private HashMap<String, String> options;	//试题选项，若试题类型为SC或MC时有选项
	private String solution;	//试题答案
	private String thinking;	//试题思路

	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
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
