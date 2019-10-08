package com.shinians.design.guardedsuspension;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/7 15:38
 * @website： www.shinians.com
 */
public class Request {
    private final String name;
    public Request(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "[ Request " + name + " ]";
    }
}
