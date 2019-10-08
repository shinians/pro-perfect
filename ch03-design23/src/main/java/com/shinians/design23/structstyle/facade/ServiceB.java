package com.shinians.design23.structstyle.facade;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 23:26
 * @website： www.shinians.com
 */
public class ServiceB implements Service{

    @Override
    public void sayName() {
        System.out.println("这是serviceB方法");
    }
}
