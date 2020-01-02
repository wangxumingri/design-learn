package factory.simple;


public class SimplePizzaFactory {

    public static  AbstractPizza cratePizza(String name,String flavour){
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
}
