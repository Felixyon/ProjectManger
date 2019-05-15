package com.projectmange.Mapper;

import com.projectmange.Entity.Cursor;
import com.projectmange.Entity.UserinfoList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoListMapper {
    List<UserinfoList> showunreaduserinfo(String name);
    void updateoneread(Cursor cursor);
    void createtable(String value);
    void inseronepice(@Param("piecename") String piecename, @Param("infocontent") String infocontent);
}
