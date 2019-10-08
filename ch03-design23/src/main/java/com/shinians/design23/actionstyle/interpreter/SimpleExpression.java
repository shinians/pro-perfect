package com.shinians.design23.actionstyle.interpreter;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:12
 * @website： www.shinians.com
 */
public class SimpleExpression extends Expression {
    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }

}
