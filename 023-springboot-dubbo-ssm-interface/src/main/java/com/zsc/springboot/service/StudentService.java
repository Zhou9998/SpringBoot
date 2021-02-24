package com.zsc.springboot.service;

import com.zsc.springboot.model.Student;

public interface StudentService {

    //根据学生id查询详情
    Student queryStudentById(Integer id);

    Integer queryAllStudentCount();
}
