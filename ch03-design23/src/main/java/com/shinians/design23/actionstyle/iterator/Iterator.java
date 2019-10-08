package com.shinians.design23.actionstyle.iterator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:28
 * @website： www.shinians.com
 */
public interface Iterator {
    Object next();

    void first();

    void last();

    boolean hasNext();
}
