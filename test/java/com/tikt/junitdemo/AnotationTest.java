package com.tikt.junitdemo;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by tikt on 16-8-12.
 * Junit的常用注解
 */
public class AnotationTest {

    /**
     * 1.@Test :将一个普通的方法修饰成为一个测试方法
     * 1-1.@Test(expected = XXException.class) :预期会抛出的异常
     * 1-2.@Test(timeout=毫秒)
     * 2.@BeforeClass ：它会在所有的方法运行前被执行，static修饰
     * 3.@AfterClass :它会在所有的方法运行结束后被执行，static修饰
     * 4.@Before :会在每一个测试方法被运行前执行一次
     * 5.@After ：会在每一个测试方法运行后被执行一次
     * 6.@Ignore : 所修饰的测试方法会被测试运行器忽略
     * 7.@RunWith :可以更改测试运行器,使自己的运行器继承 org.junit.runner.Runner
     * <p>
     * assert:断言
     */


    //这里预期会抛出算数异常,捕获到对应的异常时，测试用例也显示通过
    @Test(expected = ArithmeticException.class)
    public void testDivide() throws Exception {
        assertEquals(2, new Calculate().divide(4, 0));

    }


    //限制执行的时间，避免死循环或超时操作
    //使用@ignore，运行时该方法会被忽略
    @Ignore("可以填写忽略的原因（非必须）")
    @Test(timeout = 500)
    public void testWhile() throws Exception {

        while (true) {
            System.out.println("run forever...");
        }

    }

    @Test(timeout = 3000)
    public void testReadFile() throws Exception {

        Thread.sleep(2000);

    }


}