package template;

/**
 * 已知某人使用电脑的步骤为:开机---使用电脑---关机
 * 开机和关机两个操作是固定不变的，不确定的是使用操作
 */
public abstract class AbstractComputerService {
    public String name = null;

    /**
     * 基本操作1:开机
     */
    public void on(){
        System.out.println(name+"打开电脑");
    }

    /**
     * 基本操作2：开机后搞事情
     */
    public abstract void use();

    /**
     * 基本操作3：关机
     */
    public void off(){
        System.out.println(name+"关闭电脑");
    }

    /**
     * 模板方法
     */
    public void service(){
        on();
        if (checkUse()){
            use();
        }
        off();
    }

    /**
     * 钩子方法：是否需要执行use方法,由子类根据需要选择是否覆盖
     * @return
     */
    public boolean checkUse(){
        return true;
    }
}
