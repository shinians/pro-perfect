package com.shinians.design23.actionstyle.iterator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:29
 * @website： www.shinians.com
 */
public class IteratorImpl implements Iterator {
    private List list;

    private int index;

    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

    public void first() {
        index = 0;
    }

    public void last() {
        index = list.getSize();
    }

    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    public boolean hasNext() {
        return index < list.getSize();
    }

}
