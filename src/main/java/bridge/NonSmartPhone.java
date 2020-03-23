package bridge;

/**
 * 非智能手机
 */
public class NonSmartPhone extends Phone{

    public NonSmartPhone(Brand brand) {
        super(brand);
        super.type = "非智能手机";
    }
}
