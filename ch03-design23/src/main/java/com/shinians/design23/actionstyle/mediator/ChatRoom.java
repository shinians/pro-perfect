package com.shinians.design23.actionstyle.mediator;

import java.util.Date;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:33
 * @website： www.shinians.com
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
