package com.shinians.design23.createstyle.factory;

/**
 * @intro ：创建一个白色汽车
 * @auth ： shinians
 * @time ： 2019/9/22 0:44
 * @website： www.shinians.com
 * 定义一个将被相应的具体工厂创建的产品对象。
 */
public class WhiteCar implements ICar{
    @Override
    public void getPrice() {
        System.out.println("The white Car is 100万元!");
    }
}
