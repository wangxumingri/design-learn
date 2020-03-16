package composite;

/**
 * 抽象组件类：定义子组件和叶子节点的通用行为
 */
public abstract class AbstractOrganizationComponent {

    private String id;
    private String name;

    public AbstractOrganizationComponent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 新增方法
     *
     * @param organizationComponent
     */
    void add(AbstractOrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    void update(AbstractOrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    void delete(AbstractOrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * 抽象打印方法，子类实现
     */
    public abstract void print();

}
