package bridge;

public class HuaWei implements Brand{
    @Override
    public void lock(String phoneType) {
        System.out.println("华为"+phoneType+"按键锁屏");

    }

    @Override
    public void unlock(String phoneType) {
        System.out.println("华为"+phoneType+"背后指纹解锁");
    }
}
