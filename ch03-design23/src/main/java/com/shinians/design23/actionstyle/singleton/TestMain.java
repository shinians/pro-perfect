package com.shinians.design23.actionstyle.singleton;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:31
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
