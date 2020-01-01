package archetypal;

public class ExInfo implements Cloneable{
    private String type;

    private String value;

    public ExInfo(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    protected ExInfo clone() throws CloneNotSupportedException {
        return (ExInfo) super.clone();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.hashCode()+"ExInfo{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
