package com.shinians.design.guardedsuspension;

import java.util.LinkedList;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/7 15:39
 * @website： www.shinians.com
 */
public class RequestQueue {
    private final LinkedList<Request> queue = new LinkedList<Request>();
    public synchronized Request getRequest() {
        while (queue.size() <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return (Request)queue.removeFirst();
    }
    public synchronized void putRequest(Request request) {
        queue.addLast(request);
        notifyAll();
    }
}
