package cn.designMode.demo.strategyMode;

public class NormalPlayerStrategy implements PlayerStrategy
{

    @Override
    public void discount()
    {
       System.out.println("normal player discount:0");
    }

}
