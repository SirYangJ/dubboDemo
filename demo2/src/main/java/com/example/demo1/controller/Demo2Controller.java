package com.example.demo1.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo1.service.Demo1Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yangjie
 * @Create 2019-06-14 10:58
 */
@Controller
public class Demo2Controller {

    @Reference(version = "1.0.0")
    private Demo1Service demo1Service;


    @RequestMapping("/find")
    @ResponseBody
    public String find(){
        String s=demo1Service.find();
        return s;
    }


}
