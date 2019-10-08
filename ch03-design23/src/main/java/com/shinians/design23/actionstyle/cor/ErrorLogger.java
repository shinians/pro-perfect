package com.shinians.design23.actionstyle.cor;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 15:44
 * @website： www.shinians.com
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
