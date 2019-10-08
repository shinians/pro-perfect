package com.shinians.design23.actionstyle.cor;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 15:45
 * @website： www.shinians.com
 */
public class FileLogger extends  AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
