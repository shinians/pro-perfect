package com.shinians.design23.actionstyle.mediator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:34
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
