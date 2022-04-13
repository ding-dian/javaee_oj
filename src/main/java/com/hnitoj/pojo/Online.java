package com.hnitoj.pojo;

public class Online {
    private String hash;

    private String ip;

    private String ua;

    private String refer;

    private Integer lastmove;

    private Integer firsttime;

    private String uri;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua == null ? null : ua.trim();
    }

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer == null ? null : refer.trim();
    }

    public Integer getLastmove() {
        return lastmove;
    }

    public void setLastmove(Integer lastmove) {
        this.lastmove = lastmove;
    }

    public Integer getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Integer firsttime) {
        this.firsttime = firsttime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }
}