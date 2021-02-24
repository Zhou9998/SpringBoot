package com.zsc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot项目启动入口类
@SpringBootApplication//开启springboot配置
public class Application {

    public static void main(String[] args) {
        //springboot项目代码必须放到Application类所在的同级目录或者下级目录中
        SpringApplication.run(Application.class, args);
    }
}
