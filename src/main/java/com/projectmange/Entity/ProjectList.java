package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 基本的项目表，所有申报的项目都会放在这个表里面，这里面包括未审核成功的项目
 * @version: 1.0
 */
public class ProjectList {
    private int projectid;
    private String projectname;
    private String examinestate;
    private String begintime;
    private String nowstate;
    private String applicationuri;
    private String reporturilist;
    private String costlistid;
    private String costinvoicestate;
    private String projectdes;
    private String applyuserid;

    public String getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(String applyuserid) {
        this.applyuserid = applyuserid;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getExaminestate() {
        return examinestate;
    }

    public void setExaminestate(String examinestate) {
        this.examinestate = examinestate;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getNowstate() {
        return nowstate;
    }

    public void setNowstate(String nowstate) {
        this.nowstate = nowstate;
    }

    public String getApplicationuri() {
        return applicationuri;
    }

    public void setApplicationuri(String applicationuri) {
        this.applicationuri = applicationuri;
    }

    public String getReporturilist() {
        return reporturilist;
    }

    public void setReporturilist(String reporturilist) {
        this.reporturilist = reporturilist;
    }

    public String getCostlistid() {
        return costlistid;
    }

    public void setCostlistid(String costlistid) {
        this.costlistid = costlistid;
    }

    public String getCostinvoicestate() {
        return costinvoicestate;
    }

    public void setCostinvoicestate(String costinvoicestate) {
        this.costinvoicestate = costinvoicestate;
    }

    public void setProjectdes(String projectdes) {
        this.projectdes = projectdes;
    }

    public String getProjectdes() {
        return projectdes;
    }

    @Override
    public String toString() {
        return "ProjectList{" +
                "projectid=" + projectid +
                ", projectname='" + projectname + '\'' +
                ", examinestate='" + examinestate + '\'' +
                ", begintime='" + begintime + '\'' +
                ", nowstate='" + nowstate + '\'' +
                ", applicationuri='" + applicationuri + '\'' +
                ", reporturilist='" + reporturilist + '\'' +
                ", costlistid='" + costlistid + '\'' +
                ", costinvoicestate='" + costinvoicestate + '\'' +
                ", projectdes='" + projectdes + '\'' +
                ", applyuserid='" + applyuserid + '\'' +
                '}';
    }
}
