package com.ryoukai.unlinetest.pojo;

public class Answertest {
    private Integer answertestId;

    private Integer testId;

    private String userId;

    private String answertestPath;

    private Integer state;

    public Integer getAnswertestId() {
        return answertestId;
    }

    public void setAnswertestId(Integer answertestId) {
        this.answertestId = answertestId;
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAnswertestPath() {
        return answertestPath;
    }

    public void setAnswertestPath(String answertestPath) {
        this.answertestPath = answertestPath == null ? null : answertestPath.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}