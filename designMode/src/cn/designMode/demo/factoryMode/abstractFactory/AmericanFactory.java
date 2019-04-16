package cn.designMode.demo.factoryMode.abstractFactory;

import cn.designMode.demo.factoryMode.simpleFactory.Coffee;
import cn.designMode.demo.factoryMode.simpleFactory.MilkCoffee;

public class AmericanFactory extends CoffeeFactory
{

    @Override
    public Coffee[] produceCoffee()
    {
        return new Coffee[]{new MilkCoffee()};
    }

}
