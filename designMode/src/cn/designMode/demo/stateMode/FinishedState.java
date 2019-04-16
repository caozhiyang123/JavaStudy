package cn.designMode.demo.stateMode;

public class FinishedState implements FileState
{
    @Override
    public void fileState()
    {
        System.out.println("have bean dealt,render to lasted file list");
    }

}
