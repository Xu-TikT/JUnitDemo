package com.tikt.junitdemo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by tikt on 16-8-11.
 */
public class CalculateTest {

    /**
     * 1.测试方法上必须使用@Test进行修饰
     * 2.测试方法必须使用 public void 进行修饰，不能带任何的参数
     * 3.新建一个源代码目录来存放我们的测试代码
     * 4.测试类的包名应该和被测试类保持一致
     * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖
     * 6.测试类使用Test作为类名的后缀（不是必须的）
     * 7.测试方法使用test作为方法名的前缀不是必须的）
     *
     */




    @Test
    public void testAdd() throws Exception {
        assertEquals(6, new Calculate().add(3,3));
    }


    @Test
    public void testSubtract() throws Exception {
        assertEquals(3,new Calculate().subtract(5,2));

    }

    @Test
    public void testMultiply() throws Exception {

        assertEquals(4,new Calculate().multiply(2,2));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2,new Calculate().divide(4,2));

    }
}