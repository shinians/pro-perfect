package com.shinians.design23.structstyle.decorator;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/3 22:54
 * @website： www.shinians.com
 */
public class Decorator implements Person {
    protected  Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
       person.eat();
    }
}
