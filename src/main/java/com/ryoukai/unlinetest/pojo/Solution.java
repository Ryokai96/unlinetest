package com.ryoukai.unlinetest.pojo;

public class Solution {
    private Integer solutionId;

    private String solutionPath;

    private Integer testId;

    public Integer getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public String getSolutionPath() {
        return solutionPath;
    }

    public void setSolutionPath(String solutionPath) {
        this.solutionPath = solutionPath == null ? null : solutionPath.trim();
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }
}