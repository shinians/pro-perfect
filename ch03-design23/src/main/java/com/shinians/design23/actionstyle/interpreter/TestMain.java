package com.shinians.design23.actionstyle.interpreter;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:12
 * @website： www.shinians.com
 */
public class TestMain {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());

        for (Expression eps : ctx.getList()) {
            eps.interpret(ctx);
        }
    }

}
