package factory.simple;



public class StoreA {

    static void sellPizza(String name,String flavour){
     SimplePizzaFactory.cratePizza(name,flavour);
    }

    public static void main(String[] args) {
        StoreA.sellPizza("A","麻辣");
    }

}
