package cn.designMode.demo.strategyMode;

public class VIPPlayerStrategy implements PlayerStrategy
{

    @Override
    public void discount()
    {
        System.out.println("normal player discount:5%");
    }

}
