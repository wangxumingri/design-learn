package composite;


/**
 * 叶子节点:
 *  1.叶子节点没有可以管理的节点，不需要成员属性AbstractOrganizationComponent，也不需要add，update，delete方法
 *  2.只需实现print方法，打印出自己的id和name即可
 */
public class Department extends AbstractOrganizationComponent{

    public Department(String id, String name) {
        super(id, name);
    }

    @Override
    public void print() {
        System.out.println("\t\t"+super.getId() + "\t" + super.getName() );
    }
}
