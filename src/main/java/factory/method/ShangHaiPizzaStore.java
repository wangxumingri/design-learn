package factory.method;

public class ShangHaiPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if ("麻辣".equals(type)){
            return new ShangHaiMlPizza();
        }else if (("椒盐").equals(type)){
            return new ShangHaiJyPizza();
        }else {
            return null;
        }
    }
}
