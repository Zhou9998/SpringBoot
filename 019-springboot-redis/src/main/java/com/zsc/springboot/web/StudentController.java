package com.zsc.springboot.web;

import com.zsc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;


    @RequestMapping(value = "/put")
    public Object put(String key,String value){
        service.put(key,value);
        return "值已成功放入redis";
    }

    @RequestMapping(value = "/get")
    public String get(){
        String count =service.get("count");
        return "数据count为" + count;
    }
}
