package com.projectmange.Service.Impl;

import com.projectmange.Entity.Exp;
import com.projectmange.Mapper.ExpMapper;
import com.projectmange.Service.ExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpServiceImpl implements ExpService {
    @Autowired
    private ExpMapper expMapper;
    public List<Exp> showoneselectexpinfo(int id) {
        return expMapper.showoneselectexpinfo(id);
    }
}
