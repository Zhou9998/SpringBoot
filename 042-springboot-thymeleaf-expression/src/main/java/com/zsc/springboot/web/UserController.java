package com.zsc.springboot.web;

import com.zsc.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail(){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setUsername("张三");
        user.setAge(200);

        mv.setViewName("userDetail");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping(value = "/user/detail1")
    public String userDetail1(Model model){
        User user = new User();
        user.setId(1002);
        user.setUsername("李四");
        user.setAge(300);
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping(value = "/url")
    public String urlExpression(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("username","zs");
        model.addAttribute("age",10);
        return "url";
    }

    @RequestMapping(value = "/test")
    public @ResponseBody String test(String username){
        return "请求路径是test，参数是"+username;
    }

    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(Integer id,String username,Integer age){
        return "请求路径是test，参数是id="+id+",username="+username+",age="+age;
    }

    @RequestMapping(value = "/test/{id}")
    public @ResponseBody String test2(@PathVariable("id") Integer id){
        return "ID="+id;
    }

    @RequestMapping(value = "/url2")
    public String url2(){
        return "url2";
    }

    @RequestMapping(value = "/property")
    public String property(){
        return "property";
    }
}
