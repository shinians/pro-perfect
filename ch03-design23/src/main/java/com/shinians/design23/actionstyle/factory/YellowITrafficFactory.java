package com.shinians.design23.actionstyle.factory;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:52
 * @website： www.shinians.com
 */
public class YellowITrafficFactory implements  ITrafficFactory {
    @Override
    public ICar createCar() {
        return new YellowCar();
    }

    @Override
    public IBike createBike() {
        return new YellowBike();
    }
}
