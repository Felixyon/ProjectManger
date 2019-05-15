package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description:经历表，学生参加完科研项目之后或者参加中途，会有各种信息记录，以便于生成简单的简历
 * @version: 1.0
 */
public class Exp {
    private int expnumberid;
    private String begintime;
    private String endtime;
    private String expname;
    private String expcontent;
    private String evaluation;

    public int getExpnumberid() {
        return expnumberid;
    }

    public void setExpnumberid(int expnumberid) {
        this.expnumberid = expnumberid;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getExpname() {
        return expname;
    }

    public void setExpname(String expname) {
        this.expname = expname;
    }

    public String getExpcontent() {
        return expcontent;
    }

    public void setExpcontent(String expcontent) {
        this.expcontent = expcontent;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Exp{" +
                "expnumberid=" + expnumberid +
                ", begintime='" + begintime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", expname='" + expname + '\'' +
                ", expcontent='" + expcontent + '\'' +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }

}
