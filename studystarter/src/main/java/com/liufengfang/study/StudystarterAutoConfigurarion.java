package com.liufengfang.study;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by liufengfang on 2019/4/4.
 */
//@Configuration  //由于spring.factories里面配置了，这里的@Configuraton可以注释掉
@ComponentScan({"com.liufengfang.study.services.*"})
public class StudystarterAutoConfigurarion {
}
