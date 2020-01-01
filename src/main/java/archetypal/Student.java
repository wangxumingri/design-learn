package archetypal;

public class Student implements Cloneable{
    private String id;
    private String name;
    private Integer gender;
    private ExInfo exInfo;
    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student sClone = (Student) super.clone();
        ExInfo exClone = sClone.getExInfo().clone();
        sClone.setExInfo(exClone);
        return sClone;
    }

    public ExInfo getExInfo() {
        return exInfo;
    }

    public void setExInfo(ExInfo exInfo) {
        this.exInfo = exInfo;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.hashCode()+"Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", exInfo=" + exInfo +
                '}';
    }


}
