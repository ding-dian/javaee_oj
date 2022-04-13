package com.hnitoj.pojo;

public class ContestProblem {
    private Integer id;

    private Integer problemId;

    private Integer contestId;

    private String title;

    private Integer num;

    private Integer cAccepted;

    private Integer cSubmit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getcAccepted() {
        return cAccepted;
    }

    public void setcAccepted(Integer cAccepted) {
        this.cAccepted = cAccepted;
    }

    public Integer getcSubmit() {
        return cSubmit;
    }

    public void setcSubmit(Integer cSubmit) {
        this.cSubmit = cSubmit;
    }
}