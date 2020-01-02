package factory.origin;

public class StoreA {

    static AbstractPizza sellPizza(String name,String flavour){
        AbstractPizza pizza = null;
        switch (name){
            case "A":
                pizza = new PizzaA();
                pizza.setName(name);
                pizza.setFlavour(flavour);
                break;
            case "B":
                pizza = new PizzaB();
                pizza.setName(name);
                pizza.setFlavour(flavour);
                break;
        }
        if (pizza != null){
            pizza.createPizza();
            pizza.packagePizza();
        }
        return pizza;
    }

    public static void main(String[] args) {
        StoreA.sellPizza("A","麻辣");
    }

}
