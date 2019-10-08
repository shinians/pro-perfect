package com.shinians.design23.actionstyle.command;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 16:43
 * @website： www.shinians.com
 */
public class CommandImpl extends Command {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void execute() {
        //真正命令前或后，执行相关的处理
        receiver.receive();
    }
}
