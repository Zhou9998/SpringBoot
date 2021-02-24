package com.zsc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication //开启spring的配置
@ServletComponentScan(basePackages = "com.zsc.springboot.servlet")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
