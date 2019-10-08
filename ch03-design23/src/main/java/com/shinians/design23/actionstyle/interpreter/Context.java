package com.shinians.design23.actionstyle.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/4 17:11
 * @website： www.shinians.com
 */
public class Context {
    private String content;

    private List list = new ArrayList<Expression>();

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void add(Expression eps) {
        list.add(eps);
    }

    public List<Expression> getList() {
        return list;
    }

}
