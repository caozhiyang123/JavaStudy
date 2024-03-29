package cn.java.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CreatePoolExecuteDemo
{
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(10));
        for(int i=0;i<15;i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
            executor.getQueue().size()+"，已执行完的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
    
    static class MyTask implements Runnable {
        private int taskNum;
        
        public MyTask(int num) {
            this.taskNum = num;
        }
         
        @Override
        public void run() {
            System.out.println("正在执行task "+taskNum);
//            Thread.currentThread().sleep(4000);
            System.out.println(1/0);
            System.out.println("task "+taskNum+"执行完毕");
        }
    }
}
