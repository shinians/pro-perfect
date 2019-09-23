package com.shinians.design23.actionstyle.singleton;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:30
 * @website： www.shinians.com
 */
public class Singleton {
    private static Singleton sing;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }

}
