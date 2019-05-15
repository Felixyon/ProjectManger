package com.projectmange.Mapper;

import com.projectmange.Entity.ProjectList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectListMapper {
    List<ProjectList> showallprojectlist();
    void projectapply(ProjectList projectList);
    void checkovertostartthisproject(int id);
    List<ProjectList> showmyprojectlist(@Param("studentid") String studentid);
}
