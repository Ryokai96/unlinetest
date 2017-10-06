package com.ryoukai.unlinetest.pojo;

public class Selfsolution {
    private Integer selfsolutionId;

    private Integer selftestId;

    private String selfsolutionPath;

    public Integer getSelfsolutionId() {
        return selfsolutionId;
    }

    public void setSelfsolutionId(Integer selfsolutionId) {
        this.selfsolutionId = selfsolutionId;
    }

    public Integer getSelftestId() {
        return selftestId;
    }

    public void setSelftestId(Integer selftestId) {
        this.selftestId = selftestId;
    }

    public String getSelfsolutionPath() {
        return selfsolutionPath;
    }

    public void setSelfsolutionPath(String selfsolutionPath) {
        this.selfsolutionPath = selfsolutionPath == null ? null : selfsolutionPath.trim();
    }
}