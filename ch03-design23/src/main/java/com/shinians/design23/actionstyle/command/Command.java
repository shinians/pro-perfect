package com.shinians.design23.actionstyle.command;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 16:41
 * @website： www.shinians.com
 */
public abstract  class Command {
    //真正命令的执行者
    protected  Receiver receiver;
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

}
