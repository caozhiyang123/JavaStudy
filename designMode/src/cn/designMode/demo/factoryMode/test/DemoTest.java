package cn.designMode.demo.factoryMode.test;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import cn.designMode.demo.factoryMode.vo.Animal;

public class DemoTest
{
    private final List<Animal> clients;
    
    public DemoTest()
    {
        this.clients = new ArrayList<Animal>();
    }

    public static void main(String[] args)
    {
       /* CopyFileTest demoTest = new CopyFileTest();
        demoTest.test();
        System.out.println(demoTest);*/
        BitSet bitSet = new BitSet();
        bitSet.set(1);
        bitSet.set(5);
        bitSet.set(2);
        bitSet.set(3);
        bitSet.set(4);
        System.out.println(bitSet.toString());
        BitSet obj = (BitSet)bitSet.clone();
        obj.set(6);
        System.out.println(obj.toString());
    }

    public void test()
    {
        MyThread myThread = new MyThread();
        for(int i=0;i<100;i++){
            new Thread(myThread).start();
        }
    }
    
    class MyThread  implements Runnable{
        @Override
        public void run()
        {
            Animal animal = new Animal();
            synchronized(clients){
                clients.add(animal);
            }
            animal.startUp();
        }
    }
}
