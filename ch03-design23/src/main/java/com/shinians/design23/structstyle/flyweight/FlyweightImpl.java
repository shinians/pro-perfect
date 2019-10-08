package com.shinians.design23.structstyle.flyweight;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 12:07
 * @website： www.shinians.com
 */
public class FlyweightImpl implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值"+arg);
    }
}
