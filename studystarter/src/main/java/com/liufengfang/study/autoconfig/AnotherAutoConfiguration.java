package com.liufengfang.study.autoconfig;

import com.liufengfang.study.entity.Person;
import org.springframework.context.annotation.Bean;

/**
 * Created by liufengfang on 2020/3/20.
 */

public class AnotherAutoConfiguration {

    @Bean
    public Person person(){
        return new Person("Jemmy");
    }
}
