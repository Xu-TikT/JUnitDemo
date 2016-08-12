package com.tikt.junitdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by tikt on 16-8-12.
 * <p>
 * Junit参数化设置练习
 */


@RunWith(Parameterized.class)
public class ParameterTest {

    /**
     * 1.更改默认的测试运行器为RunWith(Parameterized.class)
     * 2.声明变量来存放预期值和结果值
     * 3.声明一个返回值为Collection的公共静态方法，并使用@Parameters进行修饰
     * 4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
     */


    int expected = 0;
    int input1 = 0;
    int input2 = 0;

    @Parameterized.Parameters
    public static Collection<Object[]> t() {
        return Arrays.asList(new Object[][]{
                {3, 1, 2},
                {4, 2, 2}
        });
    }

    public ParameterTest(int expected, int input1, int input2) {

        /**
         * 这里的预期值和输入值要与定义的测试数据的顺序对应
         */
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;


    }

    @Test
    public void testAdd() {
        /**
         * 运行之后有两组数据的结果
         */
        assertEquals(expected, new Calculate().add(input1, input2));
    }

}
