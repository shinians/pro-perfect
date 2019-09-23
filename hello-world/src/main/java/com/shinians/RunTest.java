package com.shinians;

import com.shinians.demo.AftDemo;
import com.shinians.demo.BefDemo;
import com.shinians.utils.DemoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

import static java.lang.Thread.sleep;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/8 17:16
 * @website： www.shinians.com
 */
public class RunTest {
    static Logger LOG= LoggerFactory.getLogger(RunTest.class);

    public static void main(String[] args) throws InterruptedException {
//        案例【1】
        //初始化 1000000长度测试数据
        Vector vector= DemoUtils.getVectorDemoBef(1000000);
        BefDemo.testForFixed(vector);
        AftDemo.testForFixed(vector);

    }
}
