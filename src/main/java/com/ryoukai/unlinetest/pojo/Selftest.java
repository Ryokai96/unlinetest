package com.ryoukai.unlinetest.pojo;

public class Selftest {
    private Integer selftestId;

    private Integer testId;

    private String userId;

    public Integer getSelftestId() {
        return selftestId;
    }

    public void setSelftestId(Integer selftestId) {
        this.selftestId = selftestId;
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
}