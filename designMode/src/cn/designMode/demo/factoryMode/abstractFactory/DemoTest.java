package cn.designMode.demo.factoryMode.abstractFactory;

import cn.designMode.demo.factoryMode.simpleFactory.Coffee;

public class DemoTest
{
    public static void main(String[] args)
    {
        ChinaFactory chinaFactory = new ChinaFactory();
        Coffee[] china = chinaFactory.produceCoffee();
        for (Coffee coffee : china)
        {
            System.out.println(coffee.getName());
        }
        AmericanFactory americanFactory = new AmericanFactory();
        Coffee[] american = americanFactory.produceCoffee();
        for (Coffee coffee : american)
        {
            System.out.println(coffee.getName());
        }
        
    }
}
