package com.shinians.design23.createstyle.factorymethod;


/**
 * @intro ：  实现创建具体产品对象的操作。
 * @auth ： shinians
 * @time ： 2019/9/22 0:52
 * @website： www.shinians.com
 */
public class WhiteIBikeFactory implements  IBikeFactory {

    @Override
    public IBike createBike() {
        return new WhiteBike();
    }
}
