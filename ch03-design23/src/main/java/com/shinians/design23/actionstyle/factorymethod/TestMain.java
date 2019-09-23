package com.shinians.design23.actionstyle.factorymethod;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:54
 * @website： www.shinians.com
 *

 */
public class TestMain {
    public static void main(String[] args) {
        //工厂：建造一批白色的交通工具
        IBikeFactory whiteBikeFactory=new WhiteIBikeFactory();
        whiteBikeFactory.createBike().getPrice();

        IBikeFactory yellowBikeFactory=new YellowIBikeFactory();
        yellowBikeFactory.createBike().getPrice();

    }
}
