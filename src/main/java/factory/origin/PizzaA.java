package factory.origin;

public class PizzaA extends AbstractPizza{
    @Override
    void createPizza() {
        System.out.println("制作披萨"+getName()+getFlavour());
    }
}
