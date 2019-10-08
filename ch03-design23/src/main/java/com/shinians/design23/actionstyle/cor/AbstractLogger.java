package com.shinians.design23.actionstyle.cor;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 15:36
 * @website： www.shinians.com
 */
public abstract class AbstractLogger {
    public static int INFO=1;

    public  static int DEBUG=2;

    public  static  int ERROR=3;

    protected  int level;
    //责任链中的下一个元素
    protected  AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public  void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write(String message);
}
