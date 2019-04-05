package com.liufengfang.study.demo.impl;

import com.liufengfang.study.demo.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by liufengfang on 2019/4/4.
 */
@Component
public class HelloServiceImpl implements HelloService{
    public String sayHello() {
        return "Hello - from studystarter";
    }
}
