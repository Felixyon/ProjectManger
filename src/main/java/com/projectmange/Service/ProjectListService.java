package com.projectmange.Service;

import com.projectmange.Entity.ProjectList;

import java.util.List;

public interface ProjectListService {
    List<ProjectList> showallprojectlist();
    String insernewproject(String projectname,String projectdes,String projectapplyuri,String applyuserid);
    void checkovertostartthisproject(int id,String studentid);
    void readoneinfo(String studentid,int id);
    void updateOnesUserlistWorkinggroup(String id,String studentid);
}
