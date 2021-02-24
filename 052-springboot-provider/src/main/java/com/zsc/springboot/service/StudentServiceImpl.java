package com.zsc.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zsc.springboot.mapper.StudentMapper;
import com.zsc.springboot.model.Student;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass =  StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    @Override
    public Student QueryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
