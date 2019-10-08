package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 20:49
 * @website： www.shinians.com
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
