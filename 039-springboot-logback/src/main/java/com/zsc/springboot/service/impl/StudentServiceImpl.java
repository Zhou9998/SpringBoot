package com.zsc.springboot.service.impl;

import com.zsc.springboot.mapper.StudentMapper;
import com.zsc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        Integer count = studentMapper.selectStudentCount();

        return count;
    }
}
