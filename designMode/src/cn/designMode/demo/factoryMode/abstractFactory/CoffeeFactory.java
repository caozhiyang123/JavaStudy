package cn.designMode.demo.factoryMode.abstractFactory;

import cn.designMode.demo.factoryMode.simpleFactory.Coffee;

public abstract class CoffeeFactory
{
    public abstract Coffee[] produceCoffee();
}
