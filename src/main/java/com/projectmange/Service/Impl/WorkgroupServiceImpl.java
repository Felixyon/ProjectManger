package com.projectmange.Service.Impl;

import com.projectmange.Entity.Workgroup;
import com.projectmange.Mapper.WorkflowMapper;
import com.projectmange.Mapper.WorkgroupMapper;
import com.projectmange.Service.WorkflowService;
import com.projectmange.Service.WorkgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class WorkgroupServiceImpl implements WorkgroupService {
    @Autowired private WorkgroupMapper workgroupMapper;
    @Autowired private WorkflowMapper workflowMapper;
    public List<Workgroup> showoneselectworkgroup(int id) {
        return workgroupMapper.showoneselectworkgroup(id);
    }

    public void inseronetoworkgroup(String userid, String jobrole, String username, String workflowid,String tableid) {
        workflowMapper.creteworkflowtable(workflowid);

        Workgroup workgroup=new Workgroup();
        workgroup.setRole("unsure");
        workgroup.setJobrole(jobrole);
        workgroup.setUserid(userid);
        workgroup.setUsername(username);
        workgroup.setTableid(tableid);
        workgroup.setWorkflowid(workflowid);
        workgroupMapper.insertoneworker(workgroup);
    }

    public void updateunsuretoregular(String workgroupid, String studentid) {
            workgroupMapper.updateunsure(workgroupid,studentid);
    }
}
