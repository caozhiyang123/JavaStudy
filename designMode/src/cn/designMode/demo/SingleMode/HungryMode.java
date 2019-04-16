package cn.designMode.demo.SingleMode;

public class HungryMode
{
    private static HungryMode hungry = null;
    private HungryMode(){}
    public static HungryMode getInstance(){
        if(hungry == null){
            synchronized (HungryMode.class)
            {
                if(hungry == null){
                    hungry = new HungryMode();
                }
            }
        }
        return hungry;
    }
}
