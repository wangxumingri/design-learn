package observer;

import java.util.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 此时还没有观察者，所以不会打印
        weatherData.setMeasurements(31.3F,100.0F,1000F);

        // 添加观察者
        weatherData.addObserver(new CurrentConditionObserver());
        weatherData.addObserver(new StatisticsObserver());

        // 修改气象数据，此时已经有观察者，可以打印数据
        weatherData.setMeasurements(36.3F,100.0F,1000F);
        weatherData.setMeasurements(40.2F,100.0F,2000.22F);

    }
}
