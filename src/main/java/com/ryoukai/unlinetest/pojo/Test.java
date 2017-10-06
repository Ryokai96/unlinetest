package com.ryoukai.unlinetest.pojo;

public class Test {
    private Integer testId;

    private String testDesc;

    private String testPath;

    private String testType;

    private String uploaderId;

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
        this.testDesc = testDesc == null ? null : testDesc.trim();
    }

    public String getTestPath() {
        return testPath;
    }

    public void setTestPath(String testPath) {
        this.testPath = testPath == null ? null : testPath.trim();
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType == null ? null : testType.trim();
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId == null ? null : uploaderId.trim();
    }
}