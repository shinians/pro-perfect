package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 21:00
 * @website： www.shinians.com
 */
public class Circle extends  Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
