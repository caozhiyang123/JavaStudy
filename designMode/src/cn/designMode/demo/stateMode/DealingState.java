package cn.designMode.demo.stateMode;

public class DealingState implements FileState
{
    @Override
    public void fileState()
    {
        System.out.println("file is being dealt,cannot do anything");
    }

}
