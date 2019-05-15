package com.projectmange.Service.Impl;

import com.projectmange.Entity.Student;
import com.projectmange.Mapper.StudentMapper;
import com.projectmange.Service.StudentService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public Student findonestudent(String studentid) {
        return studentMapper.findonestudent(studentid);
    }
}
