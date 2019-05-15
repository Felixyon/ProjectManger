package com.projectmange.Service.Impl;

import com.projectmange.Entity.Workgruoplist;
import com.projectmange.Mapper.WorkgroupListMapper;
import com.projectmange.Service.WorkgroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkgroupListServiceImpl implements WorkgroupListService {
    @Autowired private WorkgroupListMapper workgroupListMapper;
    public List<Workgruoplist> showallworkgrouplist() {
        return workgroupListMapper.showallworkgrouplist();
    }

    public Workgruoplist getoneuniqueworkgrouplistByProjectid(String projectid) {
        return workgroupListMapper.getoneuniqueworkgrouplistByProjectid(projectid);
    }
}
