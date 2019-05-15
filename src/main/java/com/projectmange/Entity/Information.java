package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 通知表，一个workgruop中的管理员或者导师通过通知向项目队员分配信息
 * @version: 1.0
 */

public class Information {
    private int timestamp;
    private String content;
    private String whosay;

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWhosay() {
        return whosay;
    }

    public void setWhosay(String whosay) {
        this.whosay = whosay;
    }

    @Override
    public String toString() {
        return "Information{" +
                "timestamp=" + timestamp +
                ", content='" + content + '\'' +
                ", whosay='" + whosay + '\'' +
                '}';
    }
}
