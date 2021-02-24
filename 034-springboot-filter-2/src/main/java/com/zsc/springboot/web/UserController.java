package com.zsc.springboot.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody String userDetail(){
        return "/user/detail";
    }
    @RequestMapping(value = "/center")
    public @ResponseBody String center(){
        return "center";
    }
}
