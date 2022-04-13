package com.hnitoj.pojo;

public class Custominput {
    private Integer solutionId;

    private String inputText;

    public Integer getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText == null ? null : inputText.trim();
    }
}