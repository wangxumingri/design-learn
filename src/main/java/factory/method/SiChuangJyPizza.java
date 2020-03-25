package factory.method;

public class SiChuangJyPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("准备四川椒盐披萨");
    }

    @Override
    void cut() {
        System.out.println("四川椒盐披萨不切割");
    }
}
