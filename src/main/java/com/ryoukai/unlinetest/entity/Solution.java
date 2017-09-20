package com.ryoukai.unlinetest.entity;

/**
 * 试卷答案实体类
 * @author Ryoukai
 *
 */
public class Solution {
	private int solutionId;
	private String solutionPath;	//答案路径
	private Test test;	//试卷实体
	
	public int getSolutionId() {
		return solutionId;
	}
	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionPath() {
		return solutionPath;
	}
	public void setSolutionPath(String solutionPath) {
		this.solutionPath = solutionPath;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}
