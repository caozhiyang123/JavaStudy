package cn.designMode.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class FeatureController
{
    private List<FeatureBase> features = new ArrayList<FeatureBase>();
    
    public void login(UserState userState){
        for (FeatureBase featureBase : features)
        {
            featureBase.login(userState);
        }
    }
    
    public void PlaceOrders(UserState userState){
        for (FeatureBase featureBase : features)
        {
            featureBase.PlaceOrders(userState);
        }
    }
    
    public void pay(UserState userState){
        for (FeatureBase featureBase : features)
        {
            featureBase.pay(userState);
        }
    }
}
