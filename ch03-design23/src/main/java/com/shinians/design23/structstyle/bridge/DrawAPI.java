package com.shinians.design23.structstyle.bridge;

/**
 * @intro ：创建桥接实现接口
 * @auth ： shinians
 * @time ： 2019/10/3 20:44
 * @website： www.shinians.com
 */
public interface DrawAPI {
    /**
     * 构建圆形
     * @param radius
     * @param x
     * @param y
     */
    public void drawCircle(int radius,int x,int y);

}
