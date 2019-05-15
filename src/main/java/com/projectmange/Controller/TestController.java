package com.projectmange.Controller;

import com.projectmange.Entity.*;
import com.projectmange.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "api")
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private CommentlistService commentlistService;
    @Autowired
    private CostService costService;
    @Autowired
    private EventtableService eventtableService;
    @Autowired
    private ExpService expService;
    @Autowired
    private InformationService informationService;
    @Autowired
    private ProjectListService projectListService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private WorkflowService workflowService;
    @Autowired
    private WorkgroupListService workgroupListService;
    @Autowired
    private WorkgroupService workgroupService;

    @RequestMapping(path = "showallusers",method = RequestMethod.GET)
    @ResponseBody
    public List<User> showallusers(){
        return userService.showAllUsers();
    }
    @RequestMapping(path = "showonecommentlist",method = RequestMethod.GET)
    @ResponseBody
    public List<Commentlist> showonecommentlist(
            @RequestParam int id
    ){
        return commentlistService.selectoneCommentlistandshow(id);
    }
    /**
     * @Auther: ziyang
     * @Date:
     * @Description:下面进行各项service的测试
     * @version: 1.0
     */

    @RequestMapping(path = "cost",method = RequestMethod.GET)
    @ResponseBody
    public List<Cost> cost(
            @RequestParam int id
    ){
        return costService.showonecostlist(id);
    }

    @RequestMapping(path = "eventtable",method = RequestMethod.GET)
    @ResponseBody
    public List<Eventtable> eventtable(){
       return eventtableService.showalleventlist();
    }

    @RequestMapping(path = "exp",method = RequestMethod.GET)
    @ResponseBody
    public List<Exp> exp(
            @RequestParam int id
    ){
        return expService.showoneselectexpinfo(id);
    }

    @RequestMapping(path = "information",method = RequestMethod.GET)
    @ResponseBody
    public List<Information> information(
            @RequestParam int id
    ){
        return informationService.showoneselectinformationlist(id);
    }

    @RequestMapping(path = "projectlist",method = RequestMethod.GET)
    @ResponseBody
    public List<ProjectList> showprojectlist(){
        return projectListService.showallprojectlist();
    }

    @RequestMapping(path = "student",method = RequestMethod.GET)
    @ResponseBody
    public Student sutdent(
            @RequestParam String studentid
    ){
        return studentService.findonestudent(studentid);
    }

    @RequestMapping(path = "workflow",method = RequestMethod.GET)
    @ResponseBody
    public List<Workflow> workflow(
            @RequestParam String workflowid
    ){
       return workflowService.showoneselectedworkflow(workflowid);
    }

    @RequestMapping(path = "workgrouplist",method = RequestMethod.GET)
    @ResponseBody
    public List<Workgruoplist> workgruoplist(){
        return workgroupListService.showallworkgrouplist();
    }

    @RequestMapping(path = "workgroup",method = RequestMethod.GET)
    @ResponseBody
    public List<Workgroup> workgroup(
            @RequestParam int id
    ){
        return workgroupService.showoneselectworkgroup(id);
    }

}
