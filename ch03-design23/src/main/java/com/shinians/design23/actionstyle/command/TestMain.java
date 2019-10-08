package com.shinians.design23.actionstyle.command;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 16:46
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Receiver  receiver=new Receiver();
        Command command=new CommandImpl(receiver);
        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}
