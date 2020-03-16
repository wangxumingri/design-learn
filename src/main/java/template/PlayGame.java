package template;

public class PlayGame extends AbstractComputerService{

    public PlayGame(String name) {
        super.name = name;
    }

    @Override
    public void use() {
        System.out.println(name+"使用电脑打游戏...");
    }
}
