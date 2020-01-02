package factory.simple;

import lombok.Data;

@Data
public abstract class AbstractPizza {
    private String name;// 披萨名称
    private String flavour;// 口味


    abstract void createPizza();


    /**
     * 打包方式可以看作是不变的部分
     */
    public void packagePizza() {
        System.out.println("打包:"+this.flavour+this.name);
    }

}
