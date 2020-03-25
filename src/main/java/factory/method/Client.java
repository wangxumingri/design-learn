package factory.method;

public class Client {
    public static void main(String[] args) {
        PizzaStore scPizzaStore = new SiChuangPizzaStore();
        Pizza pizza = scPizzaStore.orderPizza("麻辣");

    }
}
