package strategy.traditional;

public class Test {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.swim();

        System.out.println("-------分割线-------");

        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();
        toyDuck.swim();
    }
}
