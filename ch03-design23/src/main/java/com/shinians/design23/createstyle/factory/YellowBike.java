package com.shinians.design23.createstyle.factory;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:47
 * @website： www.shinians.com
 */
public class YellowBike implements IBike {
    @Override
    public void getPrice() {
        System.out.println("The yellow Bike is 99元!");
    }
}
