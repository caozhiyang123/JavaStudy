package cn.designMode.demo.controller;

public interface Test
{
    public void doLogin();
    public void doAgain();
    
     static void logout(){}
     default void doLogout(){
         System.out.println("do logout");
     }
}
