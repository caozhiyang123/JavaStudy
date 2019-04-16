package cn.designMode.demo.strategyMode;

public class AdvancedPlayerStrategy implements PlayerStrategy
{

    @Override
    public void discount()
    {
       System.out.println("normal player discount:2%");
    }

}
