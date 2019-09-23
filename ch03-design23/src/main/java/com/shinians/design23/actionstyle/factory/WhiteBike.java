package com.shinians.design23.actionstyle.factory;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:44
 * @website： www.shinians.com
 */
public class WhiteBike implements IBike{
    @Override
    public void getPrice() {
        System.out.println("The white Bike is 1000元!");
    }
}
