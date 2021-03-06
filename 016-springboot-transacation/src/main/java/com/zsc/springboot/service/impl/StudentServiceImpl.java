package com.zsc.springboot.service.impl;

import com.zsc.springboot.mapper.StudentMapper;
import com.zsc.springboot.model.Student;
import com.zsc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public Integer updateStudentById(Student student) {
        //修改成功
        int i = studentMapper.updateByPrimaryKeySelective(student);
        //失败
        int j = 10/0;
        return i;
    }
}
