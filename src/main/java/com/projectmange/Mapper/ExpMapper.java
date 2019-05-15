package com.projectmange.Mapper;

import com.projectmange.Entity.Exp;

import java.math.BigInteger;
import java.util.List;

public interface ExpMapper {
    List<Exp> showoneselectexpinfo(int id);
    void createexp(BigInteger bigInteger);
}
