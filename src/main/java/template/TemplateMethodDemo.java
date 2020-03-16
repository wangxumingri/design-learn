package template;

public abstract class TemplateMethodDemo {
    public static void main(String[] args) {
        AbstractComputerService computerService1 = new PlayGame("小米");
        computerService1.service();

        System.out.println("---------分割线---------");

        AbstractComputerService computerService2 = new Study("小宝");
        computerService2.service();
    }
}



