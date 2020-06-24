package observer;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 接收到事件后，更新数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp,float humidity,float pressure);
}
