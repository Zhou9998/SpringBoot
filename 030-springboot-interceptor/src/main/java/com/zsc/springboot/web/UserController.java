package com.zsc.springboot.web;

import com.zsc.springboot.model.User;
import jdk.internal.instrumentation.TypeMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "user")
public class UserController {


    //用户登录的请求
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request){
        User user = new User();
        user.setId(1001);
        user.setUserName("zs");
        user.setAge(222);
        //将用户的信息存放到session中
        request.getSession().setAttribute("user",user);
        return "login Success";
    }
    //该请求需要用户登录以后才可以访问
    @RequestMapping(value = "/center")
    public Object center(){
        return "see Center Message";
    }
    //该请求不登录也可以访问
    @RequestMapping(value = "/out")
    public Object out(){
        return "Out see anytime";
    }
    //如果用户未登录访问了需要登录才可访问的请求，之后会跳转至该请求
    @RequestMapping(value = "/error")
    public Object error(){
        return "error";
    }
}
