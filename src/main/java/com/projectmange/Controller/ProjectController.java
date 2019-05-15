package com.projectmange.Controller;

import com.projectmange.Entity.Agreeinfo;
import com.projectmange.Entity.UserinfoList;
import com.projectmange.Entity.Workgruoplist;
import com.projectmange.Mapper.WorkgroupListMapper;
import com.projectmange.Service.InformationService;
import com.projectmange.Service.ProjectListService;
import com.projectmange.Service.WorkgroupListService;
import com.projectmange.Service.WorkgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "project")
public class ProjectController {
    @Autowired
    ProjectListService projectListService;
    @Autowired
    InformationService informationService;
    @Autowired
    WorkgroupService workgroupService;
    @Autowired
    WorkgroupListService workgroupListService;

    @RequestMapping(path = "applynewproject",method = RequestMethod.GET)
    @ResponseBody
    String applynewproject(
            @RequestParam String projectname,
            @RequestParam String projectdes,
            @RequestParam String applicationrui,
            @RequestParam String studentid
    ){

        String infocontent="您申请的项目:"+projectname+"已经提交，请耐心等待管理员审核";
        informationService.sendinfotouserinfolist(studentid,infocontent);
        return projectListService.insernewproject(projectname,projectdes,applicationrui,studentid);
    }

    @RequestMapping(path = "check",method = RequestMethod.GET)
    @ResponseBody
    String check(
        @RequestParam int id,
        @RequestParam String studentid
    ){
        projectListService.checkovertostartthisproject(id,studentid);
        String infocontent="您有新项目审核通过，并已添加为默认工作组";
        informationService.sendinfotouserinfolist(studentid,infocontent);
        return "审核成功";
    }

    @RequestMapping(path = "insertonemember",method = RequestMethod.GET)
    @ResponseBody
    String inserttoonemember(
            @RequestParam String userid,
            @RequestParam String jobrole,
            @RequestParam String username,
            @RequestParam String tableid,
            @RequestParam String projectname,
            @RequestParam String index
    ){
        String workflowid="workgroup"+String.valueOf(tableid)+"workflow"+index;
        workgroupService.inseronetoworkgroup(userid,jobrole,username,workflowid,tableid);
        String infocontent="你被邀请加入"+projectname+"项目组,确定进入该工作组";
        Agreeinfo agreeinfo=new Agreeinfo();
        agreeinfo.setId(userid);
        agreeinfo.setSid(tableid);
        agreeinfo.setTempcontent(infocontent);
        informationService.sendinfotouserinfolist(userid,agreeinfo.toString());
        return "邀请成功";
    }


    /**
     * @Auther: ziyang
     * @Date:
     * @Description: 读了一条信息后无操作，只是阅读更改
     * @version: 1.0
     */
    @RequestMapping(path = "readoneinfo",method = RequestMethod.GET)
    @ResponseBody
    void readoneinfo(
            @RequestParam String studentid,
            @RequestParam int id
    ){
        projectListService.readoneinfo(studentid,id);
    }

    /**
     * @Auther: ziyang
     * @Date:
     * @Description:读了一条信息后有操作，并且要同意进入工作组
     * 做三件事，第一把workgroup中的人的unsure去掉，第二队长要收到信息，确认该同学已经加入该组织,第三该同学的userlist表中workinggroup更新
     * @version: 1.0
     */
    @RequestMapping(path = "agreeinvestgation",method = RequestMethod.GET)
    @ResponseBody
    void  agreeinvestgation(
            @RequestParam String workgroupid,
            @RequestParam String studentid,
            @RequestParam String username
    ){
        //去掉unsure
        workgroupService.updateunsuretoregular(workgroupid,studentid);
        //获取队长的userid
        Workgruoplist workgruoplist=workgroupListService.getoneuniqueworkgrouplistByProjectid(workgroupid);
        String userid=workgruoplist.getLeaderid();

        //队长收到信息
        String infocontent=username+"已经成功加入到工作组!";
        Agreeinfo agreeinfo=new Agreeinfo();
        agreeinfo.setTempcontent(infocontent);
        informationService.sendinfotouserinfolist(userid,agreeinfo.toString());

        //更新该同学的userlist表
        projectListService.updateOnesUserlistWorkinggroup(workgroupid,studentid);



    }

}
