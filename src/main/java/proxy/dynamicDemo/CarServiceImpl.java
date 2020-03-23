package proxy.dynamicDemo;

/**(
 * 目标类
 */
public class CarServiceImpl implements CarService{
    @Override
    public void getAll() {
        System.out.println("CarServiceImpl:getAll");
    }
}
