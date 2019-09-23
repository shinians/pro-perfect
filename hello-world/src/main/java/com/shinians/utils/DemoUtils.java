package com.shinians.utils;

import java.util.Vector;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/9/8 17:22
 * @website： www.shinians.com
 */
public class DemoUtils {

    /**
     * 方法：初始化Vector测试数据
     * size：长度
     *
     * Vector 可实现自动增长的对象数组。
     java.util.vector提供了向量类(Vector)以实现类似动态数组的功能。
     创建了一个向量类的对象后，可以往其中随意插入不同类的对象，即不需顾及类型也不需预先选定向量的容量，并可以方便地进行查找。
     对于预先不知或者不愿预先定义数组大小，并且需要频繁地进行查找，插入，删除工作的情况，可以考虑使用向量类
     * @param size
     * @return
     */
    public static  Vector getVectorDemoBef(int size){
        long star=System.currentTimeMillis();
        Vector vector=new Vector();
        for(int i=0;i<size;i++){
            vector.add("字符串特长字符串特长字符串特长字符串特长字符串特长字符串特长"+i);
        }
        long time=System.currentTimeMillis();
        System.out.println("getVectorDemoBef优化前用时："+(time-star));
        return  vector;
    }

}
