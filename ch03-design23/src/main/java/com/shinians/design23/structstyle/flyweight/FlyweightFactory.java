package com.shinians.design23.structstyle.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 12:08
 * @website： www.shinians.com
 */
public class FlyweightFactory {
    private static Map flyweights = new HashMap();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new FlyweightImpl());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
