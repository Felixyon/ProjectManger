package com.projectmange.Entity;

public class UserinfoList {
    private int id;
    private String infocontent;
    private int read;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfocontent() {
        return infocontent;
    }

    public void setInfocontent(String infocontent) {
        this.infocontent = infocontent;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "UserinfoList{" +
                "id=" + id +
                ", infocontent='" + infocontent + '\'' +
                ", read=" + read +
                '}';
    }
}
