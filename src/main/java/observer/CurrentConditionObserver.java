package observer;

/**
 * 当前温度和湿度
 */
public class CurrentConditionObserver implements Observer,Display{
    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        // 展示数据
        this.display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionObserver：");
        System.out.println("\t温度:"+this.temp);
        System.out.println("\t湿度:"+this.humidity);
    }
}
