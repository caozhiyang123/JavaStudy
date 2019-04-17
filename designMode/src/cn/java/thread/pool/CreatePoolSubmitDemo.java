package cn.java.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CreatePoolSubmitDemo
{
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(10));
        for(int i=0;i<15;i++){
            MyTask myTask = new MyTask(i);
            Future future = executor.submit(myTask);
            try
            {
                if(future.get() == null){
                    System.out.println("task "+i+" execute success");
                }
            } catch (Exception e)
            {
                System.out.println("task "+i+" execute fail"+e);
            }
            
            System.out.println("�̳߳����߳���Ŀ��"+executor.getPoolSize()+"�������еȴ�ִ�е�������Ŀ��"+
            executor.getQueue().size()+"����ִ�����������Ŀ��"+executor.getCompletedTaskCount());
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
            System.out.println("����ִ��task "+taskNum);
            System.out.println(1/0);
            System.out.println("task "+taskNum+"ִ�����");
        }
    }
}
