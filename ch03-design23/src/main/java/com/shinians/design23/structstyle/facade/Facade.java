package com.shinians.design23.structstyle.facade;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 23:32
 * @website： www.shinians.com
 */
public class Facade {
    Service serviceA;
    Service serviceB;
    Service serviceC;
    public Facade(){
        serviceA=new ServiceA();
        serviceB=new ServiceB();
        serviceC=new ServiceC();
    }
    public  void  methodA(){
        serviceA.sayName();
    }
    public  void  methodB(){
        serviceB.sayName();
    }
    public  void  methodC(){
        serviceC.sayName();
    }
}
