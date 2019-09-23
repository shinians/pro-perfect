package com.shinians.demo;

import java.util.Vector;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/8 17:05
 * @website： www.shinians.com
 */
public class BefDemo {

    /**
     * 案例【1】 优化前
     * @param vector
     */
    public  static void testForFixed (Vector vector) {
        long star=System.currentTimeMillis();
        for (int i = 0; i < vector.size (); i++){
            //do somethings
        }
        long time=System.currentTimeMillis();
        System.out.println("testForFixed优化前用时："+(time-star));

    }
}
