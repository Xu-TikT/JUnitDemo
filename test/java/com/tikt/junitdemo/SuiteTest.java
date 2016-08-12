package com.tikt.junitdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by tikt on 16-8-12.
 *
 * Junit测试套件练习
 *
 *
 */
//使用RunWith将次类变为测试套件的入口类
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {

    /**
     * 测试套件类中只能为空
     * 在Suite.SuiteClasses中传入要执行的测试类,且要为数组形式
     *
     * 1.测试套件就是组织测试类一起运行的
     *
     * 写一个作为测试套件的入口类，这个类中不包含其他的方法
     * 更改测试运行器Suite.class
     * 将要测试的类作为数组传入到Suite.SuiteClasses中
     *
     */

}
