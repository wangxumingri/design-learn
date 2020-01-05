package strategy.traditional;

public abstract class Duck {
    /**
     * 展示鸭子信息：每个鸭子都不一样
     */
    public abstract void display();

    public void quack(){
        System.out.println("鸭子叫...");
    }

    public void swim(){
        System.out.println("鸭子游泳...");
    }

    public void fly(){
        System.out.println("鸭子飞...");
    }
}
