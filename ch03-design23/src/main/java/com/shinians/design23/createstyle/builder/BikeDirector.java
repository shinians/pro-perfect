package com.shinians.design23.createstyle.builder;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:54
 * @website： www.shinians.com
 */
public class BikeDirector {
    public  Bike constructBike(BikeBuilder bikeBuilder){
        bikeBuilder.buildBikeSeat();
        bikeBuilder.buildBikeFrame();
        bikeBuilder.buildBikeTire();
        return  bikeBuilder.buildBike();
    }
}
