package cn.designMode.demo.strategyMode;

public class DemoTest
{
    public static void main(String[] args)
    {
        new PlayerContext(new NormalPlayerStrategy()).discount();
        new PlayerContext(new AdvancedPlayerStrategy()).discount();
        new PlayerContext(new VIPPlayerStrategy()).discount();
    }
}
