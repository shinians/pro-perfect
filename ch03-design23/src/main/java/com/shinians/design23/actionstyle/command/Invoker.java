package com.shinians.design23.actionstyle.command;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 16:45
 * @website： www.shinians.com
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

}
