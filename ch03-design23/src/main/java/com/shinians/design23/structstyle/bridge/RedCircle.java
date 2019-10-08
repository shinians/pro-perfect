package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：创建实现了 DrawAPI 接口的实体桥接实现类
 * @auth ： shinians
 * @time ： 2019/10/3 20:48
 * @website： www.shinians.com
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
