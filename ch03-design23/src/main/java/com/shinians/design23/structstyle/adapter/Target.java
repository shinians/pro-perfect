package com.shinians.design23.structstyle.adapter;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 16:41
 * @website： www.shinians.com
 */
public interface Target {
    /**
     * 被适配者方法
     */
    void adapteeMethod();

    /**
     * 适配器方法
     */
    void adapterMethod();

}
