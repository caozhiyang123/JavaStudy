package cn.designMode.demo.controller;

public class TestImpl implements Test
{
    @Override
    public void doLogin(){
        System.out.println("doLogin");
    }

    @Override
    public void doAgain()
    {
        
    }
    
    void doVerify(){
        System.out.println("verify");
    }
}
