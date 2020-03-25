package factory.method;

public class SiChuangPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if ("麻辣".equals(type)){
            return new SiChuangMlPizza();
        }else if (("椒盐").equals(type)){
            return new SiChuangJyPizza();
        }else {
            return null;
        }
    }
}
