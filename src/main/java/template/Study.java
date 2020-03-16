package template;

public class Study extends AbstractComputerService{

    public Study(String name) {
        super.name = name;
    }

    @Override
    public void use() {
        System.out.println(name+"使用电脑学习...");
    }

    @Override
    public boolean checkUse() {
        return false;
    }
}
