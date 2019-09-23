package com.shinians.design23.actionstyle.builder;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:59
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        BikeDirector bd = new BikeDirector();
        Bike bike = bd.constructBike(new OfoBikeBuider());
        System.out.println(bike.getBikeSeat());
        System.out.println(bike.getBikeFrame());
        System.out.println(bike.getBikeTire());

    }
}
