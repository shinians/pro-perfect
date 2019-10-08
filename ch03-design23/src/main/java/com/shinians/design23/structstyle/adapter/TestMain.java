package com.shinians.design23.structstyle.adapter;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 16:46
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Target target=new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}
