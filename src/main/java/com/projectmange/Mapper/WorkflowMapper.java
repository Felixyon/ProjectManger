package com.projectmange.Mapper;

import com.projectmange.Entity.Workflow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkflowMapper {
    List<Workflow> showoneselectedworkflow(@Param("tablename") String tablename);
    void creteworkflowtable(@Param("tablename") String tablename);
}
