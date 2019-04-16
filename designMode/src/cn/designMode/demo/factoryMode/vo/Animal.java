package cn.designMode.demo.factoryMode.vo;

import java.util.ArrayList;
import java.util.List;

import com.google.common.util.concurrent.AtomicDouble;

public class Animal
{
    public static List<AtomicDouble> everyEBSpent;
    
    public void startUp(){
        if(everyEBSpent == null){
//            synchronized (Animal.class)
//            {
                everyEBSpent = new ArrayList<>();
                for (int i = 0; i < 11; i++)
                {
                    everyEBSpent.add(new AtomicDouble(1));
                }
//            }
            System.out.println(Animal.everyEBSpent !=null?Animal.everyEBSpent.size():0);
        }
    }
}
