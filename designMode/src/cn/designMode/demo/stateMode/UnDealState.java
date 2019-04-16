package cn.designMode.demo.stateMode;

public class UnDealState implements FileState
{

    @Override
    public void fileState()
    {
        System.out.println("file have not bean dealt,render to file list page");
    }

}
