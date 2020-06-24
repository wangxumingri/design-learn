package observer;

import java.util.HashMap;
import java.util.Map;

public class StatisticsObserver implements Observer ,Display{
    private Map<String,Float> averageMeasurementData = new HashMap<>(5);
    private int count = 0;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.count++;
        this.setAverageMeasurementData("averageTemp",temp);
        this.setAverageMeasurementData("averageHumidity",humidity);
        this.setAverageMeasurementData("averagePressure",pressure);

        this.display();
    }

    /**
     * 计算气象数据平均值
     * @param key
     * @param newValue
     */
    private void setAverageMeasurementData(String key,float newValue){
        Float oldAverageValue = averageMeasurementData.get(key);
        if (oldAverageValue == null){
            averageMeasurementData.put(key,newValue/count);
        }else {
            averageMeasurementData.put(key,(newValue+oldAverageValue)/count);
        }
    }

    @Override
    public void display() {
        System.out.println("StatisticsObserver :");
        System.out.println("\t平均温度:"+averageMeasurementData.get("averageTemp"));
        System.out.println("\t平均湿度:"+averageMeasurementData.get("averageHumidity"));
        System.out.println("\t平均气压:"+averageMeasurementData.get("averagePressure"));
    }
}
