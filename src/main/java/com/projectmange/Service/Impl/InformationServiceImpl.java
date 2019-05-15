package com.projectmange.Service.Impl;

import com.projectmange.Entity.Information;
import com.projectmange.Entity.UserinfoList;
import com.projectmange.Mapper.InformationMapper;
import com.projectmange.Mapper.UserinfoListMapper;
import com.projectmange.Service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationMapper informationMapper;
    @Autowired
    private UserinfoListMapper userinfoListMapper;

    public List<Information> showoneselectinformationlist(int id) {
        return informationMapper.showoneselectinformationlist(id);
    }
    /**
     * @Auther: ziyang
     * @Date:
     * @Description:下面的方法实现向用户信息系统发送信息
     * @version: 1.0
     */
    public void sendinfotouserinfolist(String name, String infocontent) {
        userinfoListMapper.inseronepice(name,infocontent);
    }
}
