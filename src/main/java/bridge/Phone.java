package bridge;

public abstract class Phone {
    public String type;// 手机分类

    // 手机厂商
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * 锁屏
     */
    void lock(){
        brand.lock(type);
    }

    /**
     * 解锁
     */
    void unlock(){
        brand.unlock(type);
    }
}

