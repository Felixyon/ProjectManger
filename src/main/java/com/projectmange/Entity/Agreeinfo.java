package com.projectmange.Entity;

public class Agreeinfo {
    private String id;//区分自己的id
    private String sid;//即将添加入的workgroup名称id
    private String tempcontent;

    @Override
    public String toString() {
        return "Agreeinfo{" +
                "id='" + id + '\'' +
                ", sid='" + sid + '\'' +
                ", tempcontent='" + tempcontent + '\'' +
                '}';
    }

    public String getTempcontent() {
        return tempcontent;
    }

    public void setTempcontent(String tempcontent) {
        this.tempcontent = tempcontent;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
