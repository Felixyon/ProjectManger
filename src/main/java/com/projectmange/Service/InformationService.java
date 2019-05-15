package com.projectmange.Service;

import com.projectmange.Entity.Information;
import com.projectmange.Entity.UserinfoList;

import java.util.List;

public interface InformationService {
    List<Information> showoneselectinformationlist(int id);
    void sendinfotouserinfolist(String name, String infocontent);
}
