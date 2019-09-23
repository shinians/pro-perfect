package com.shinians.design23.actionstyle.factory;

/**
 * @intro ：创建一个黄色汽车
 * @auth ： shinians
 * @time ： 2019/9/22 0:47
 * @website： www.shinians.com
 */
public class YellowCar implements ICar {
    @Override
    public void getPrice() {
        System.out.println("The yellow Car is 1万元!");
    }
}
