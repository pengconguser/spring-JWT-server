package com.list.listTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String get(){
        return "欢迎访问专门为layne配置的服务器";
    }

    @GetMapping("/getTest")
    public String test(){
        return "测试用路由";
    }

}
