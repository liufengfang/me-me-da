package com.liufengfang.study.services.impl;

import com.liufengfang.study.services.HelloService;
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
