package com.shinians.design23.actionstyle.iterator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:30
 * @website： www.shinians.com
 */
public interface List {
    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);

}
