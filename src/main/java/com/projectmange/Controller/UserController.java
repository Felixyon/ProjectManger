package com.projectmange.Controller;

import com.projectmange.Entity.ProjectList;
import com.projectmange.Entity.User;
import com.projectmange.Service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: ziyang
 * @Date: 4月10日
 * @Description: 用户系统的controller
 * @version: 1.0
 */
@Controller
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(path = "registernewuser",method =RequestMethod.GET)
    @ResponseBody
    public String registernewuser(
            @RequestParam String fullname,
            @RequestParam String nickname,
            @RequestParam String studentid,
            @RequestParam String password,
            @RequestParam String rpassword
    ){
        if (password.equals(rpassword)){
            userService.insertnewuser(fullname,nickname,studentid,password);
            return "registersuccessfully!";
        }else {
            return "registererror";
        }


    }

    @RequestMapping(path = "loginner",method = RequestMethod.GET)
    @ResponseBody
    public String login(
            @RequestParam String studentid,
            @RequestParam String password
    ){
        return userService.login(studentid,password);
    }

    //通过学号查询一个用户的新题

    @RequestMapping(path = "getoneuserinfobyuserid",method = RequestMethod.GET)
    @ResponseBody
    public User getoneuserinfobyuserid(
            @RequestParam String studentid
    ){
       return userService.selectoneuser(studentid);
    }

    //返回一个人领导的所有项目

    @RequestMapping(path = "getmyleaderprojects",method = RequestMethod.GET)
    @ResponseBody
    public List<ProjectList> getmyleaderprojects(
            @RequestParam String mystudentid
    ){
        return userService.getmyleadprojects(mystudentid);

    }

}
