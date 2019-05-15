package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 事件记录表，任何涉及人事调动或者费用相关的修改都会记录在eventtable中，比如管理员删除了某个科研项目下的某个学生名单，比如费用得到审核等等，这样的信息都会在这个表中被记录。
 * @version: 1.0
 */
public class Eventtable {
    private int eventid;
    private String timestamp;
    private String eventcontent;

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEventcontent() {
        return eventcontent;
    }

    public void setEventcontent(String eventcontent) {
        this.eventcontent = eventcontent;
    }

    @Override
    public String toString() {
        return "EventtableMapper{" +
                "eventid=" + eventid +
                ", timestamp='" + timestamp + '\'' +
                ", eventcontent='" + eventcontent + '\'' +
                '}';
    }
}
