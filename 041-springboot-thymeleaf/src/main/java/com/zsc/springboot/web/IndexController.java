package com.zsc.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("data","springboot thymeleaf");
        return "index";
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("index");
        mv.addObject("data","springboot thymeleaf");
        return mv;
    }
}
