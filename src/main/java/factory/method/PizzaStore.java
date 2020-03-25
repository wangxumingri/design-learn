package factory.method;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法，由子类实现
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
