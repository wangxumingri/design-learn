package factory.simple;



public class StoreB {

    static void sellPizza(String name,String flavour){
        SimplePizzaFactory.cratePizza(name,flavour);
    }

    public static void main(String[] args) {
        StoreB.sellPizza("B","麻辣");
    }

}
