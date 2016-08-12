package com.tikt.junitdemo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by tikt on 16-8-12.
 */
public class SpringTest {

    private static ApplicationContext context = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        //这个文件到哪里获得？
        //首先要在项目中右键选择 Add Framework Support... ,再选择Spring
        //在项目中右键新建XML文件，选择Spring,并在其中添加id为date的bean标签

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void test() {
        Date date = (Date) context.getBean("date");
        System.out.println(date);

    }


}
