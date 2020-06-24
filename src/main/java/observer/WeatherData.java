package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (observerList.size() < 1){
            System.out.println("孤家寡人，没人关注朕。");
            return;
        }
        for (Observer observer : observerList) {
            observer.update(this.temp,this.humidity,this.pressure);
        }
    }

    /**
     * 设置气象数据
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        // 更新气象信息后，立即通知观察者
        this.measurementsChanged();
    }

    /**
     * 气象数据更新
     */
    public void measurementsChanged(){
        this.notifyObservers();
    }
}
