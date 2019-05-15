package com.projectmange.Service.Impl;

import com.projectmange.Entity.Workflow;
import com.projectmange.Mapper.WorkflowMapper;
import com.projectmange.Service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkflowServiceImpl implements WorkflowService {
    @Autowired private WorkflowMapper workflowMapper;
    public List<Workflow> showoneselectedworkflow(String id) {
        return workflowMapper.showoneselectedworkflow(id);
    }
}
