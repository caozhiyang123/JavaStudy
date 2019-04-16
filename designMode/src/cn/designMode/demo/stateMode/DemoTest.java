package cn.designMode.demo.stateMode;

public class DemoTest
{
    public static void main(String[] args)
    {
        new FileContext(new UnDealState()).fileState();
        new FileContext(new DealingState()).fileState();
        new FileContext(new FinishedState()).fileState();
    }
}
