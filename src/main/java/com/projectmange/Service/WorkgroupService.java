package com.projectmange.Service;

import com.projectmange.Entity.Workgroup;

import java.util.List;

public interface WorkgroupService {
    List<Workgroup> showoneselectworkgroup(int id);
    void inseronetoworkgroup(String userid,String jobrole,String username,String workflowid,String tableid);
    void updateunsuretoregular(String workgroupid,String studentid);
}
