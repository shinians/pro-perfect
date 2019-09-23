package com.shinians.design23.actionstyle.prototype;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 2:19
 * @website： www.shinians.com
 */
public class Prototype implements  Cloneable  {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
