package com.shinians.design23.actionstyle.builder;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/23 1:47
 * @website： www.shinians.com
 */
public class Bike {
    //车座
    private String bikeSeat;
    //车架
    private String  bikeFrame;

    //车胎
    private String bikeTire;

    public String getBikeSeat() {
        return bikeSeat;
    }

    public void setBikeSeat(String bikeSeat) {
        this.bikeSeat = bikeSeat;
    }

    public String getBikeFrame() {
        return bikeFrame;
    }

    public void setBikeFrame(String bikeFrame) {
        this.bikeFrame = bikeFrame;
    }

    public String getBikeTire() {
        return bikeTire;
    }

    public void setBikeTire(String bikeTire) {
        this.bikeTire = bikeTire;
    }
}
