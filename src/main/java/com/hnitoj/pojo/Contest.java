package com.hnitoj.pojo;

import java.util.Date;

public class Contest {
    private Integer contestId;

    private String title;

    private Date startTime;

    private Date endTime;

    private String defunct;

    private Byte privated;

    private Integer langmask;

    private String password;

    private Integer userId;

    private String description;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDefunct() {
        return defunct;
    }

    public void setDefunct(String defunct) {
        this.defunct = defunct == null ? null : defunct.trim();
    }

    public Byte getPrivated() {
        return privated;
    }

    public void setPrivated(Byte privated) {
        this.privated = privated;
    }

    public Integer getLangmask() {
        return langmask;
    }

    public void setLangmask(Integer langmask) {
        this.langmask = langmask;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}