package observer;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * 添加一个观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 当数据变化时，通知所有观察者
     */
    void notifyObservers();
}
