package bridge;

public class XiaoMi implements Brand{
    @Override
    public void lock(String phoneType) {
        System.out.println("小米"+phoneType+"小爱语音锁屏");

    }

    @Override
    public void unlock(String phoneType) {
        System.out.println("小米"+phoneType+"屏下指纹解锁");
    }
}
