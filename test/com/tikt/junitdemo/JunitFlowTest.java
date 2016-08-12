package com.tikt.junitdemo;

import org.junit.*;

/**
 * Created by tikt on 16-8-12.
 * <p>
 * 学习JUnit运行流程
 */
public class JunitFlowTest {

    /**
     *
     this is BeforeClass
     this is Before
     this is test1...
     this is After
     this is Before
     this is test2...
     this is After
     this is AfterClass
     *
     * 1.@BeforeClass修饰的方法会在所有方法被调用前被执行，而且该方法是静态的，所以当测试类被加载后接着就会运行它，
     *   而且在内存中它只会存在一份实例，它比较适合加载配置文件
     * 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的连接
     * 3.@Before和@After会在每个测试方法的前后各执行一次。
     *
     *
     */



    @Test
    public void test1() throws Exception {

        System.out.println("this is test1...");

    }
    @Test
    public void test2() throws Exception {

        System.out.println("this is test2...");

    }
    @Before
    public void setUp() throws Exception {

        System.out.println("this is Before");

    }

    @After
    public void tearDown() throws Exception {

        System.out.println("this is After");

    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.out.println("this is BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("this is AfterClass");

    }

}
