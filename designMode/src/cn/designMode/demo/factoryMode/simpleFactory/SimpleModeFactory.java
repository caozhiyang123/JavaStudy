package cn.designMode.demo.factoryMode.simpleFactory;

public class SimpleModeFactory
{
    private static final String LATTE_COFFEE = "latte_coffee";
    private static final String MILK_COFFEE = "milk_coffee";
    
    public Coffee buyCoffee(String name){
        Coffee coffee = null;
        switch(name)
        {
            case LATTE_COFFEE:
                coffee = new LatteCoffee();
                break;
            case MILK_COFFEE:
                coffee = new MilkCoffee();
                break;
        }
        return coffee;
    }
    
    public static void main(String[] args)
    {
        Coffee coffee = null;
        coffee = new SimpleModeFactory().buyCoffee("latte_coffee");
        System.out.println(coffee.getName());
        coffee = new SimpleModeFactory().buyCoffee("milk_coffee");
        System.out.println(coffee.getName());
    }
}
