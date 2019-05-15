package com.projectmange.Mapper;

import com.projectmange.Entity.Workgruoplist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkgroupListMapper {
    List<Workgruoplist> showallworkgrouplist();
    void insertintoworkgrouplist(Workgruoplist workgruoplist);
    Workgruoplist getoneuniqueworkgrouplistByProjectid(@Param("projectid") String projectid);

}
