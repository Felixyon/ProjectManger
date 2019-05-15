package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description:学生表，存储了学生的真实姓名和学号，确保学生为真实对应的个体
 * @version: 1.0
 */
public class Student {
    private String studentid;
    private String name;

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", name='" + name + '\'' +
                '}';
    }
}
