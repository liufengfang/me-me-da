package com.liufengfang.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liufengfang on 2019/4/4.
 */
//@Configuration  //����spring.factories���������ˣ������@Configuraton����ע�͵�
@ComponentScan({"com.liufengfang.study.demo.*"})
public class StudystarterAutoConfigurarion {
}
