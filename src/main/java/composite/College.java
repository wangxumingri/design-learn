package composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 子组件2:
 * 1.实现父类抽象方法
 * 2.根据需要覆盖父类其他方法
 */
public class College extends AbstractOrganizationComponent {
    // 维护下一级子组件:department
    private Map<String, AbstractOrganizationComponent> componentMap = new HashMap<>();

    public College(String id, String name) {
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
