package com.zsc.springboot.web;

import com.zsc.springboot.model.Student;
import com.zsc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student")
    public @ResponseBody Student queryStudentById(Integer id){

        Student student = service.queryStudentById(id);

        //调用业务层的方法
        return student;
    }
}
