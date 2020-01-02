package factory.simple;

public class PizzaB extends AbstractPizza {
    @Override
    void createPizza() {
        System.out.println("制作披萨"+getName()+getFlavour());
    }
}
