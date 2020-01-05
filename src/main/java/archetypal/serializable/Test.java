package archetypal.serializable;

public class Test {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.setName("inner_1");
        innerClass.setValue("1");

        OuterClass outerClass = new OuterClass();
        outerClass.setInnerClass(innerClass);
        outerClass.setName("原型name");
        outerClass.setValue(1);

        OuterClass bySerializable = outerClass.deepClone();

        System.out.println(outerClass.hashCode()+":"+outerClass);

        System.out.println(bySerializable.hashCode()+":"+bySerializable);

        System.out.println(bySerializable.equals(outerClass));
        innerClass.setValue("2");

        System.out.println(outerClass.hashCode()+":"+outerClass);

        System.out.println(bySerializable.hashCode()+":"+bySerializable);
    }
}
