package cn.designMode.demo.factoryMode.abstractFactory;

import cn.designMode.demo.factoryMode.simpleFactory.Coffee;
import cn.designMode.demo.factoryMode.simpleFactory.LatteCoffee;

public class ChinaFactory extends CoffeeFactory
{

    @Override
    public Coffee[] produceCoffee()
    {
        return new Coffee[]{new LatteCoffee()};
    }

}
