package com.projectmange.Service;

import com.projectmange.Entity.ProjectList;
import com.projectmange.Entity.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    void insertnewuser(String realname,String nickname,String studentid,String password);
    String login(String studentid,String password);
    User selectoneuser(String studengid);
    List<ProjectList> getmyleadprojects(String studentid);
}
