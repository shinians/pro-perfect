package com.shinians.design23.createstyle.builder;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:40
 * @website： www.shinians.com
 */
public interface BikeBuilder {

    //构建车座
    void buildBikeSeat();
    //构建车架
    void buildBikeFrame();

    //车胎
    void buildBikeTire();

    Bike buildBike();

}
