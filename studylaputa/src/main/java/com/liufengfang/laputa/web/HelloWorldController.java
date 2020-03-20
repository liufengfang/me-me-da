package com.liufengfang.laputa.web;

import com.liufengfang.study.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liufengfang on 2019/4/4.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String hello(){
        return helloService.sayHello();
    }
}
