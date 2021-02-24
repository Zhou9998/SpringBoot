package com.zsc.springboot.service;

import com.zsc.springboot.model.Student;

public interface StudentService {

    //根据学生id查询
    Student QueryStudentById(Integer id);
}
