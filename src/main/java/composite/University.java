package composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 子组件1：
 *  1.维护下一级节点
 *  2.重写父类中的add,update,remove方法
 *  3.实现print方法，打印自己的信息和维护的下一级组件的信息
 */
public class University extends AbstractOrganizationComponent{
    // 维护下一级子组件:College
    private Map<String, AbstractOrganizationComponent> componentMap = new HashMap<>();

    public University(String id, String name) {
        super(id, name);
    }

    @Override
    void add(AbstractOrganizationComponent organizationComponent) {
        componentMap.put(organizationComponent.getId(), organizationComponent);
    }

    @Override
    void update(AbstractOrganizationComponent organizationComponent) {
        AbstractOrganizationComponent component = componentMap.get(organizationComponent.getId());
        if (null != component) {
            componentMap.put(organizationComponent.getId(), organizationComponent);
        } else {
            System.err.println("组织信息不存在，无法修改");
        }
    }

    @Override
    void delete(AbstractOrganizationComponent organizationComponent) {
        AbstractOrganizationComponent component = componentMap.get(organizationComponent.getId());
        if (null != component) {
            componentMap.remove(organizationComponent.getId());
        } else {
            System.err.println("组织信息不存在，删除失败");
        }
    }

    @Override
    public void print() {
        System.out.println("----------" + super.getId() + "\t" + super.getName() + "----------");

        for (AbstractOrganizationComponent component : componentMap.values()) {
            component.print();
        }
    }
}
