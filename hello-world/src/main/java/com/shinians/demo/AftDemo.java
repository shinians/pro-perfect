package com.shinians.demo;

import java.util.Vector;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/8 17:06
 * @website： www.shinians.com
 */
public class AftDemo {


    /**
     * 案例【1】
     * 优化建议：避免在循环条件中使用复杂表达式
     *
     * 在不做编译优化的情况下，在循环中，循环条件会被反复计算，
     * 如果不使用复杂表达式，而使循环条件值不变的话，程序将会运行的更快
     * @param vector
     */
    public static void testForFixed (Vector vector) {
        long star=System.currentTimeMillis();
        int size = vector.size ();
        for (int i = 0; i < size; i++) {
            //do somethings
        };
        long time=System.currentTimeMillis();
        System.out.println("testForFixed优化后用时："+(time-star));
    }
}
