package com.shinians.design23.structstyle.decorator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 22:56
 * @website： www.shinians.com
 */
public class ManDecoratorA extends  Decorator {
    public void  eat(){
        super.eat();
        drink();
        System.out.println("ManDecoratorA类");
    }
    public void drink(){
        System.out.println("喝点东西");
    }
}
