package com.zsc.springboot.web;


import com.zsc.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;
    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "school.name="+school.getName()+"======school.website"+school.getWebsite();
    }
}
