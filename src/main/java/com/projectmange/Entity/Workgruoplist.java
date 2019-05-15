package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 所有的工作组的总表，记录一个工作组的生命周期及它对应的project
 * @version: 1.0
 */
public class Workgruoplist {
    private int workgruopid;
    private int commentlistid;
    private String timestate;
    private String begintime;
    private String workforproject;
    private String nowstate;
    private String information;
    private String leaderid;

    public int getWorkgruopid() {
        return workgruopid;
    }

    public void setWorkgruopid(int workgruopid) {
        this.workgruopid = workgruopid;
    }

    public int getCommentlistid() {
        return commentlistid;
    }

    public void setCommentlistid(int commentlistid) {
        this.commentlistid = commentlistid;
    }

    public String getTimestate() {
        return timestate;
    }

    public void setTimestate(String timestate) {
        this.timestate = timestate;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getWorkforproject() {
        return workforproject;
    }

    public void setWorkforproject(String workforproject) {
        this.workforproject = workforproject;
    }

    public String getNowstate() {
        return nowstate;
    }

    public void setNowstate(String nowstate) {
        this.nowstate = nowstate;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid;
    }

    @Override
    public String toString() {
        return "Workgruoplist{" +
                "workgruopid=" + workgruopid +
                ", commentlistid=" + commentlistid +
                ", timestate='" + timestate + '\'' +
                ", begintime='" + begintime + '\'' +
                ", workforproject='" + workforproject + '\'' +
                ", nowstate='" + nowstate + '\'' +
                ", information='" + information + '\'' +
                ", leaderid='" + leaderid + '\'' +
                '}';
    }
}
