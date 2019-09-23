package com.shinians.design23.actionstyle.prototype;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 2:27
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype)pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }
}
