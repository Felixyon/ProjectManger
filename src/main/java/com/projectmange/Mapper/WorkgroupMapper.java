package com.projectmange.Mapper;

import com.projectmange.Entity.Workgroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkgroupMapper {
    List<Workgroup> showoneselectworkgroup(int id);
    void createworkgroup(String value);
    void insertoneworker(Workgroup workgroup);
    void updateunsure(@Param("workgroupid")String workgroupid,@Param("studentid")String studentid);
}
