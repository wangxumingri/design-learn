package factory.method;

public class ShangHaiJyPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("准备上海椒盐披萨");
    }
}
