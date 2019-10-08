package com.shinians.design23.structstyle.proxy;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 12:57
 * @website： www.shinians.com
 */
public class ProxyObject implements Object {
    Object obj;
    public ProxyObject() {
        System.out.println("这是代理类");
        obj = new ObjectImpl();
    }
    @Override
    public void action() {
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
}
