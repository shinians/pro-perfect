package com.shinians.design23.structstyle.adapter;

/**
 * @intro ：适配器
 * @auth ： shinians
 * @time ： 2019/10/3 16:43
 * @website： www.shinians.com
 */
public class Adapter implements  Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("适配器调用方法：Adapter method!");

    }
}
