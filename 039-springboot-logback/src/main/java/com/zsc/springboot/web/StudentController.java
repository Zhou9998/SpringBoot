package com.zsc.springboot.web;

import com.zsc.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/count")
    public @ResponseBody String studentCount(){
        log.info("查询当前学生总人数");
        Integer studentCount = service.queryStudentCount();
        return "学生总人数为："+studentCount;
    }
}
