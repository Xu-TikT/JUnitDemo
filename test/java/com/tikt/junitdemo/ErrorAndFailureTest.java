package com.tikt.junitdemo;

import com.tikt.junitdemo.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tikt on 16-8-12.
 * 测试用例只能证明你没有错，但不能证明你业务逻辑是否正确
 * <p>
 * 这里学习下测试用例出错的两种情况
 */
public class ErrorAndFailureTest {

    /**
     * 1.Failure 一般由单元测试使用的断言方法哦按段失败所引起的，这仅表示测试点发现了问题，就是说程序输出的结果和我们预期的不一样
     * 2.Error 是由代码异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个隐藏bug
     * 3.测试用例不是用来证明你是对的，而是用来证明你没有错
     */



    @Test
    public void testAdd() {
        assertEquals(5, new Calculate().add(3, 3));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2,new Calculate().divide(4,0));

    }


}
