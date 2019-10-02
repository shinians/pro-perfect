package com.shinians.design23.createstyle.factorymethod;


/**
  @auth ： shinians
 * @time ： 2019/9/22 0:40
 * @website： www.shinians.com
 * 声明一个创建抽象产品对象的操作接口
 */
public interface IBikeFactory {

    /**
     * 创建一辆 自行车
     * @return
     */
    IBike createBike();
}
