package com.projectmange.Service;

import com.projectmange.Entity.Workgruoplist;

import java.util.List;

public interface WorkgroupListService {
    List<Workgruoplist> showallworkgrouplist();
    Workgruoplist getoneuniqueworkgrouplistByProjectid(String projectid);
}
