package com.shinians.design23.actionstyle.cor;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 15:43
 * @website： www.shinians.com
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
