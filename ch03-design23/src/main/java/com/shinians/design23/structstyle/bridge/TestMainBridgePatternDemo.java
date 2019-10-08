package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 21:01
 * @website： www.shinians.com
 */
public class TestMainBridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
