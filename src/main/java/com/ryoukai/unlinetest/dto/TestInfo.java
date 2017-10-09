package com.ryoukai.unlinetest.dto;

/**
 * 试卷基本信息封装
 * @author Ryoukai
 *
 */
public class TestInfo {
	private Integer testId;	//试卷id
	private String testDesc;	//试卷描述
	private String testType;	//试卷类型
	private UserInfo uploader;	//试卷上传者
	
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
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
	public UserInfo getUploader() {
		return uploader;
	}
	public void setUploader(UserInfo uploader) {
		this.uploader = uploader;
	}
	
}
