package com.shinians.design23.actionstyle.factory;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/22 0:54
 * @website： www.shinians.com
 * 适用性：
 *  1.一个系统要独立于它的产品的创建、组合和表示时。

   2.一个系统要由多个产品系列中的一个来配置时。

 3.当你要强调一系列相关的产品对象的设计以便进行联合使用时。

 4.当你提供一个产品类库，而只想显示它们的接口而不是实现时。

 */
public class TestMain {
    public static void main(String[] args) {
        //工厂：建造一批白色的交通工具
        ITrafficFactory whiteTraffic=new WhiteITrafficFactory();
        IBike whiteBike=whiteTraffic.createBike();
        whiteBike.getPrice();
        ICar whiteCar=whiteTraffic.createCar();
        whiteCar.getPrice();

        //工厂：建造一批黄色的交通工具
        ITrafficFactory yellowTraffic=new YellowITrafficFactory();
        yellowTraffic.createBike().getPrice();
        yellowTraffic.createCar().getPrice();
    }
}
