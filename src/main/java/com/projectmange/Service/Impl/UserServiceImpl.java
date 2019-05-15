package com.projectmange.Service.Impl;

import com.projectmange.Entity.ProjectList;
import com.projectmange.Entity.Student;
import com.projectmange.Entity.User;
import com.projectmange.Mapper.*;
import com.projectmange.Service.UserService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ExpMapper expMapper;
    @Autowired
    private UserinfoListMapper userinfoListMapper;
    @Autowired
    private ProjectListMapper projectListMapper;

    public List<User> showAllUsers() {
        return userMapper.selectUserAll();
    }

    public void insertnewuser(String realname, String nickname, String studentid, String password) {
        //普通用户表插入
        User user=new User();
        user.setUsername(nickname);
        user.setStudentid(studentid);
        user.setPassword(password);
        //下面设计自动成成的用户信息
        user.setPhotouri("");
        user.setPhonenumber("");
        user.setGrade(studentid.substring(0,4)+"级");
        user.setClassnumber("");
        user.setRole("学生");
        user.setWorkinggruop("");
        user.setWorkgrouplist("");
        user.setEmailadress(studentid+"@whu.edu.cn");
        BigInteger stuidint = new BigInteger(studentid);
        user.setExpid(studentid);


        //自动创建exp表
        expMapper.createexp(stuidint);

        //将数据插入学生表
        Student student=new Student();
        student.setStudentid(studentid);
        student.setName(realname);
        studentMapper.insertstudent(student);

        //自动创建用户消息表userinfolist
        userinfoListMapper.createtable(studentid);


        //插入用户表
        userMapper.insertnewuser(user);



    }

    public String login(String studentid, String password) {
        User user=userMapper.login(studentid);
//        System.out.println(user.toString());
        if (user!=null&&user.getPassword().equals(password)){
            return user.getUsername();
        }else {
            return "login failed!";
        }
    }

    public User selectoneuser(String studentid){
        return userMapper.getoneuser(studentid);
    }

    public List<ProjectList> getmyleadprojects(String studentid) {

        return projectListMapper.showmyprojectlist(studentid);
    }

}
