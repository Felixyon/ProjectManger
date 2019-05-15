package com.projectmange.Service.Impl;

import com.projectmange.Entity.*;
import com.projectmange.Mapper.*;
import com.projectmange.Service.ProjectListService;
import com.projectmange.Service.WorkgroupListService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectListServiceImpl implements ProjectListService {
    @Autowired
    private ProjectListMapper projectListMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private WorkgroupMapper workgroupMapper;
    @Autowired
    private WorkgroupListMapper workgroupListMapper;
    @Autowired
    private CommentlistMapper commentlistMapper;
    @Autowired
    private WorkflowMapper workflowMapper;
    @Autowired
    private UserinfoListMapper userinfoListMapper;

    public List<ProjectList> showallprojectlist() {
        return projectListMapper.showallprojectlist();
    }

    public String insernewproject(String projectname, String projectdes, String projectapplyuri, String applyuserid) {
        ProjectList projectList = new ProjectList();
        projectList.setProjectname(projectname);
        projectList.setProjectdes(projectdes);
        projectList.setApplicationuri(projectapplyuri);
        projectList.setExaminestate("未审核");
        projectList.setBegintime(String.valueOf(new Date().getTime()));//设置开始申请的时间
        projectList.setNowstate("项目申请期");
        projectList.setReporturilist("");
        projectList.setCostlistid("");
        projectList.setCostinvoicestate("无提交发票");
        projectList.setApplyuserid(applyuserid);
        projectListMapper.projectapply(projectList);
        return "已提交申请";

    }

    public void checkovertostartthisproject(int id, String studentid) {
        //项目审核通过，项目正式开始
        //发送通知信息在Controller中进行
        //projectlist表更新
        projectListMapper.checkovertostartthisproject(id);//不包含建表操作，所以可以立即执行
        //创建符合对应id 的workgroup表，并更新workgrouplist,并操作update userlist
        //1.创建workgroup表
        workgroupMapper.createworkgroup(String.valueOf(id));
        //2.更新workgrouplist表，和workgroup表
        //先获取username的信息
        User user = userMapper.getonesusername(studentid);
        //创建commentlist表
        commentlistMapper.cretecommentlist(id);//一个project对应一个commentlist没问题

        //插入一条到workgrouplist表
        Workgruoplist workgruoplist = new Workgruoplist();
        workgruoplist.setBegintime(String.valueOf(new Date().getTime()));
        workgruoplist.setCommentlistid(id);//要创建commentlist表
        workgruoplist.setInformation("initialinfomation");
        workgruoplist.setLeaderid(studentid);
        workgruoplist.setNowstate("进行中");
        workgruoplist.setTimestate("有效");
        workgruoplist.setWorkforproject(String.valueOf(id));
        workgroupListMapper.insertintoworkgrouplist(workgruoplist);

        //创建workflow表
        workflowMapper.creteworkflowtable("workgroup" + String.valueOf(id) + "workflow1");

        //更新workgroup表
        Workgroup workgroup = new Workgroup();
        workgroup.setUserid(studentid);
        workgroup.setJobrole("产品经理");
        workgroup.setRole("项目队长");
        workgroup.setUsername(user.getUsername());
        workgroup.setWorkflowid("workgroup" + String.valueOf(id) + "workflow1");//创建workflow表
        workgroup.setTableid(String.valueOf(id));
        workgroupMapper.insertoneworker(workgroup);


        //3.更新userlist
        userMapper.updateworkgroupinfo(String.valueOf(id), studentid);


    }

    public void readoneinfo(String studentid, int id) {//更新阅读一条信息
        Cursor cursor=new Cursor();
        cursor.setValue(studentid);
        cursor.setId(id);
        userinfoListMapper.updateoneread(cursor);
    }

    public void updateOnesUserlistWorkinggroup(String id, String studentid) {
        userMapper.updateworkgroupinfo(id,studentid);
    }


}
