package com.shinians.design23.structstyle.decorator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 22:56
 * @website： www.shinians.com
 */
public class ManDecoratorB extends  Decorator {
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }

}
