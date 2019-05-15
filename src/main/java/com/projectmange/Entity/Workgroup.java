package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 一个工作组的表对应着一个工作组，工作组里面的项目成员是根据这个表进行展开的，每个工作组对应唯一的科研项目
 * @version: 1.0
 */
public class Workgroup {
    private String userid;
    private String role;
    private String jobrole;
    private String username;
    private String workflowid;
    private String tableid;

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String getTableid() {
        return tableid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWorkflowid() {
        return workflowid;
    }

    public void setWorkflowid(String workflowid) {
        this.workflowid = workflowid;
    }

    @Override
    public String toString() {
        return "Workgroup{" +
                "userid=" + userid +
                ", role='" + role + '\'' +
                ", jobrole='" + jobrole + '\'' +
                ", username='" + username + '\'' +
                ", workflowid='" + workflowid + '\'' +
                '}';
    }
}
