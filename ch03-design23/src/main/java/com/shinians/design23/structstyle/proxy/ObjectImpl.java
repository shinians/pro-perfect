package com.shinians.design23.structstyle.proxy;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 12:57
 * @website： www.shinians.com
 */
public class ObjectImpl implements Object {
    @Override
    public void action() {
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
    }
}
