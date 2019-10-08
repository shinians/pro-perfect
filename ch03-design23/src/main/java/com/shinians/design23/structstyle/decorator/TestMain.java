package com.shinians.design23.structstyle.decorator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 23:00
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();

    }
}
