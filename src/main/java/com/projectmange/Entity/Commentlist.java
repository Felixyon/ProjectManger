package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 评论表，记载各种关键位置的评论区，比如workgruop的评论区，综合科研板块的评论区等等
 * @version: 1.0
 */
public class Commentlist {
    private int timestamp;
    private String who;
    private String saywhat;

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getSaywhat() {
        return saywhat;
    }

    public void setSaywhat(String saywhat) {
        this.saywhat = saywhat;
    }

    @Override
    public String toString() {
        return "Commentlist{" +
                "timestamp=" + timestamp +
                ", who='" + who + '\'' +
                ", saywhat='" + saywhat + '\'' +
                '}';
    }
}
