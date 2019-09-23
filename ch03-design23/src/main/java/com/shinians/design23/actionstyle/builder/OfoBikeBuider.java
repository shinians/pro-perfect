package com.shinians.design23.actionstyle.builder;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:50
 * @website： www.shinians.com
 */
public class OfoBikeBuider implements  BikeBuilder {
    Bike bike;
    public  OfoBikeBuider(){
        bike=new YellowBike();
    }
    @Override
    public void buildBikeSeat() {
        bike.setBikeSeat("构建ofo的车座");
    }

    @Override
    public void buildBikeFrame() {
        bike.setBikeFrame("构建ofo的车架");
    }

    @Override
    public void buildBikeTire() {
        bike.setBikeTire("构建ofo的车轮");
    }

    @Override
    public Bike buildBike() {
        return bike;
    }
}
