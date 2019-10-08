package com.shinians.design.masterworker;


import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @intro ：
 * @auth ： shinians
 * @time ： 2019/10/7 14:34
 * @website： www.shinians.com
 */
public class Master {
    //任务队列
    protected Queue<Object> workQuery = new ConcurrentLinkedQueue<Object>();
    //worker进程队列
    protected Map<String, Thread> threadMap = new HashMap<>();
    //子任务处理结果集
    protected Map<String, Object> resultMap = new ConcurrentHashMap<>();

    //是否所有的子任务都结束了
    public boolean isComplete() {
        for (Map.Entry<String, Thread> entry : threadMap.entrySet()) {
            if (entry.getValue().getState()!=Thread.State.TERMINATED){
                return false;
            }
        }
        return true;
    }

    //Master 的构造，需要一个Worker 进程逻辑，和需要的Worker进程数量
    public Master(Worker worker, int countWorker){
        worker.setWorkQueue(workQuery);
        worker.setResultMap(resultMap);
        for (int i = 0; i < countWorker; i++) {
            threadMap.put(Integer.toString(i),new Thread(worker));
        }
    }

    //提交一个任务
    public void submit(Object job){
        workQuery.add(job);
    }

    //返回子任务结果集
    public Map<String,Object> getResultMap(){
        return resultMap;
    }

    //开始运行所有的worker进程，进行处理
    public void  execute(){
        for (Map.Entry<String,Thread> entry : threadMap.entrySet()){
            entry.getValue().start();
        }
    }


}
