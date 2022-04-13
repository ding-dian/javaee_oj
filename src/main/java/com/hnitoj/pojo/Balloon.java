package com.hnitoj.pojo;

public class Balloon {
    private Integer balloonId;

    private Integer userId;

    private Integer sid;

    private Integer cid;

    private Integer pid;

    private Byte status;

    public Integer getBalloonId() {
        return balloonId;
    }

    public void setBalloonId(Integer balloonId) {
        this.balloonId = balloonId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}