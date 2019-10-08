package com.shinians.design.guardedsuspension;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/7 15:40
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 3141592L).start();
        new ServerThread(requestQueue, "Bobby", 6535897L).start();
    }
}
