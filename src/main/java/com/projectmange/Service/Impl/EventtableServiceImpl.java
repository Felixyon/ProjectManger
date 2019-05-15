package com.projectmange.Service.Impl;

import com.projectmange.Entity.Eventtable;
import com.projectmange.Mapper.EventtableMapper;
import com.projectmange.Service.EventtableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventtableServiceImpl implements EventtableService {
    @Autowired
    private EventtableMapper eventtableMapper;
    public List<Eventtable> showalleventlist() {
        return eventtableMapper.showalleventlist();
    }
}
