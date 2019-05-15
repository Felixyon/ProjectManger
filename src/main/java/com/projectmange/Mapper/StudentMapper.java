package com.projectmange.Mapper;

import com.projectmange.Entity.Student;

public interface StudentMapper {
    Student findonestudent(String studentid);
    void insertstudent(Student student);
}
