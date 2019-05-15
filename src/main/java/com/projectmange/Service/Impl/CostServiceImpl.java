package com.projectmange.Service.Impl;

import com.projectmange.Entity.Cost;
import com.projectmange.Mapper.CostMapper;
import com.projectmange.Service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CostServiceImpl implements CostService {
    @Autowired
    private CostMapper costMapper;
    public List<Cost> showonecostlist(int id) {
        return costMapper.showonecostlist(id);
    }
}
