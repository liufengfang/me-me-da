package com.liufengfang.study;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by liufengfang on 2019/4/4.
 */
//@Configuration  //����spring.factories���������ˣ������@Configuraton����ע�͵�
@ComponentScan({"com.liufengfang.study.services.*"})
public class StudystarterAutoConfigurarion {
}
