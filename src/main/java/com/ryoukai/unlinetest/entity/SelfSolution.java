package com.ryoukai.unlinetest.entity;

/**
 * 用户试题库答案实体类
 * @author Ryoukai
 *
 */
public class SelfSolution {
	private int selfsolutionId;
	private SelfTest selfTest;	//用户试题库实体
	private String selfsolutionPath;	//用户试题库答案路径
	
	public int getSelfsolutionId() {
		return selfsolutionId;
	}
	public void setSelfsolutionId(int selfsolutionId) {
		this.selfsolutionId = selfsolutionId;
	}
	public SelfTest getSelfTest() {
		return selfTest;
	}
	public void setSelfTest(SelfTest selfTest) {
		this.selfTest = selfTest;
	}
	public String getSelfsolutionPath() {
		return selfsolutionPath;
	}
	public void setSelfsolutionPath(String selfsolutionPath) {
		this.selfsolutionPath = selfsolutionPath;
	}
	
}
