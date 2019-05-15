package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 工作流程表，给一个工作组中的每个项目成员分配任务，甚至以后还可以用于生成甘特图等等
 * @version: 1.0
 */
public class Workflow {
    private String id;
    private String content;
    private String state;
    private String begintime;
    private String purposetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getPurposetime() {
        return purposetime;
    }

    public void setPurposetime(String purposetime) {
        this.purposetime = purposetime;
    }

    @Override
    public String toString() {
        return "Workflow{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", state='" + state + '\'' +
                ", begintime='" + begintime + '\'' +
                ", purposetime='" + purposetime + '\'' +
                '}';
    }
}
