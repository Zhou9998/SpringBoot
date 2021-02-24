package com.zsc.springboot.service.impl;

import com.zsc.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "sayhello";
    }
}
