package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：使用 DrawAPI 接口创建抽象类 Shape。
 * @auth ： shinians
 * @time ： 2019/10/3 20:56
 * @website： www.shinians.com
 */
public abstract class Shape {
    protected  DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract  void  draw();
}
