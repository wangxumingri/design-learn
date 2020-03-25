package factory.method;

public class SiChuangMlPizza extends Pizza{
    @Override
    void prepare() {
        System.out.println("准备四川麻辣披萨");
    }

    @Override
    void cut() {
        System.out.println("四川的披萨不切割");
    }
}
