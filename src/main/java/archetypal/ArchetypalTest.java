package archetypal;

public class ArchetypalTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.setId("1");
        s1.setGender(1);
        s1.setName("甲");
        ExInfo exInfo = new ExInfo("类型1","1");
        s1.setExInfo(exInfo);

        Student clone =  s1.clone();
        System.out.println("----修改前----");
        System.out.println(s1);
        System.out.println(clone);

        exInfo.setType("类型2");
        System.out.println("----修改后----");
        System.out.println(s1);
        System.out.println(clone);
    }
}
