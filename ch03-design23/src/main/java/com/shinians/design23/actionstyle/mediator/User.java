package com.shinians.design23.actionstyle.mediator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:34
 * @website： www.shinians.com
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
