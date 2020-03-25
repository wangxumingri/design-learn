package factory.method;

public class ShangHaiMlPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("准备上海麻辣披萨");
    }
}
