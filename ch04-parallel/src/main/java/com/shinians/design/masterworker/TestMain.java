package com.shinians.design.masterworker;

import java.util.Map;
import java.util.Set;

/**
 * @intro ：
 * 要实现计算1+2+..+100的结果，代码如下
 * @auth ： shinians
 * @time ： 2019/10/7 14:51
 * @website： www.shinians.com
 */
public class TestMain extends Worker  {
    @Override
    public Object handle(Object input) {
        Integer i = (Integer) input;
        return i+1;
    }

    public static void main(String[] args) {
        Master master = new Master(new TestMain(), 5);
        for (int i = 0; i < 100; i++) {
            master.submit(i); //提交一百个子任务
        }
        master.execute(); //开始计算
        int re = 0;
        Map<String, Object> resultMap = master.getResultMap();
        while (resultMap.size() > 0 || !master.isComplete()) {
            Set<String> keys = resultMap.keySet();
            String key = null;
            for (String k : keys) {
                key = k;
                break;
            }
            Integer i = null;
            if (key != null) {
                i = (Integer) resultMap.get(key);   //从结果集中获取结果
            }
            if (i != null) {
                re += i;        //最终结果
            }
            if (key != null) {
                resultMap.remove(key);      //移除已经被计算过的项
            }
        }
        System.out.println("result: " + re);
    }

}
