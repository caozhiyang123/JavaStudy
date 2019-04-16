package cn.designMode.demo.SingleMode.test;

import java.util.HashSet;
import java.util.Set;

import cn.designMode.demo.SingleMode.HungryMode;

public class DemoTest
{
    public static void main(String[] args)
    {
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       new Thread(new MyThread()).start();
       System.out.println(MyThread.set);
    }
    
    static class MyThread  implements Runnable{
        private static Set<HungryMode> set = new HashSet<HungryMode>();
        @Override
        public void run()
        {
            set.add(HungryMode.getInstance());
        }
    }
}
