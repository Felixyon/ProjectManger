package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 用户信息表，包括密码验证的关键信息都在里面
 * @version: 1.0
 */
public class User {
    private int userid;
    private String username;
    private String studentid;
    private String photouri;
    private String grade;
    private String classnumber;
    private String role;
    private String phonenumber;
    private String expid;
    private String workinggruop;
    private String emailadress;
    private String password;
    private String workgrouplist;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getPhotouri() {
        return photouri;
    }

    public void setPhotouri(String photouri) {
        this.photouri = photouri;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getExpid() {
        return expid;
    }

    public void setExpid(String expid) {
        this.expid = expid;
    }

    public String getWorkinggruop() {
        return workinggruop;
    }

    public void setWorkinggruop(String workinggruop) {
        this.workinggruop = workinggruop;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWorkgrouplist(String workgrouplist) {
        this.workgrouplist = workgrouplist;
    }

    public String getWorkgrouplist() {
        return workgrouplist;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", studentid='" + studentid + '\'' +
                ", photouri='" + photouri + '\'' +
                ", grade='" + grade + '\'' +
                ", classnumber='" + classnumber + '\'' +
                ", role='" + role + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", expid='" + expid + '\'' +
                ", workinggruop='" + workinggruop + '\'' +
                ", emailadress='" + emailadress + '\'' +
                ", password='" + password + '\'' +
                ", workgrouplist='" + workgrouplist + '\'' +
                '}';
    }
}
