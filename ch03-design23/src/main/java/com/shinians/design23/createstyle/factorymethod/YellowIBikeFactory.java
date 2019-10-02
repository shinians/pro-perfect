package com.shinians.design23.createstyle.factorymethod;



/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:52
 * @website： www.shinians.com
 */
public class YellowIBikeFactory implements IBikeFactory {

    @Override
    public IBike createBike() {
        return new YellowBike();
    }
}
