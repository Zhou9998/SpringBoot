package com.zsc.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody Object userDetail(){
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("id",1001);
        retMap.put("username","lisi");
        return retMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("username","wangwu");
        return "UserDetail";
    }

}
