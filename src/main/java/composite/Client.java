package composite;

public class Client {
    public static void main(String[] args) {
        // 大学
        AbstractOrganizationComponent university = new University("U001","科院");

        // 学院
        AbstractOrganizationComponent collegeA = new College("C0001","A学院");
        AbstractOrganizationComponent collegeB = new College("C0002","B学院");
        AbstractOrganizationComponent collegeC = new College("C0003","C学院");

        // 专业
        AbstractOrganizationComponent departmentA = new Department("D0001","A专业");
        AbstractOrganizationComponent departmentB = new Department("D0002","B专业");
        AbstractOrganizationComponent departmentC = new Department("D0003","C专业");
        AbstractOrganizationComponent departmentD = new Department("D0004","D专业");
        AbstractOrganizationComponent departmentE = new Department("D0005","E专业");

        // 大学管理学院
        university.add(collegeA);
        university.add(collegeB);
        university.add(collegeC);


        // 学院管理专业
        collegeA.add(departmentA);
        collegeA.add(departmentB);

        collegeB.add(departmentC);
        collegeB.add(departmentD);
        collegeB.add(departmentE);

        university.print();

        collegeB.setName("B-plus学院");
        university.update(collegeB);
        university.print();
    }
}
