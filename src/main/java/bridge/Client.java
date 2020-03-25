package bridge;

public class Client {
    public static void main(String[] args) {
        Phone xiaoMiSmartPhone = new SmartPhone(new XiaoMi());
        xiaoMiSmartPhone.lock();
        xiaoMiSmartPhone.unlock();

        Phone huaWeiNonSmartPhone = new NonSmartPhone(new HuaWei());
        huaWeiNonSmartPhone.lock();
        huaWeiNonSmartPhone.unlock();


        System.out.println(Phone.class.isAssignableFrom(NonSmartPhone.class));
        System.out.println(Phone.class.isAssignableFrom(SmartPhone.class));

        System.out.println(Phone.class.isAssignableFrom(Phone.class));
    }
}
