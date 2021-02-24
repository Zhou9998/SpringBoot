package com.zsc.springboot.web;

import com.zsc.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

/*@Controller*/
@RestController//相当于控制层类上加@Controller + 方法上加@ResponseBody，意味着当前控制层类中所有方法返回的都是JSON对象
public class StudentController {
    @RequestMapping(value = "/student")
    public Object student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zs");
        return student;
    }

    //该方法请求方式支持：GET和POST请求
    @RequestMapping(value = "/studentDetail",method = {RequestMethod.GET,RequestMethod.POST})
    public Object studentDetail(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

    @GetMapping(value = "/queryStudentById2")
    public Object queryStudentById2(){
        return "Only Get Method";
    }

    @PostMapping(value = "/queryStudentById3")
    public Object insert(){
        return "Insert Success";
    }

    @DeleteMapping(value = "/delete")
    public Object delete(){
        return "Delete Student";
    }

    @PutMapping(value = "update")
    public Object update(){
        return "update Student";
    }
}
