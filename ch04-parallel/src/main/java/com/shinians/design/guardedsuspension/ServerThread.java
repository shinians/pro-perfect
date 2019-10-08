package com.shinians.design.guardedsuspension;

import java.util.Random;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/7 15:39
 * @website： www.shinians.com
 */
public class ServerThread extends Thread  {
    private Random random;
    private RequestQueue requestQueue;
    public ServerThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName() + " handles  " + request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
            }
        }
    }
}
