package factory.method;

public abstract class Pizza {
    abstract void prepare();

    void bake(){
        System.out.println("烘烤披萨");
    }
    void cut(){
        System.out.println("切割披萨");
    }
    void box(){
        System.out.println("打包披萨");
    }
}
