package singleton;

import archetypal.cloneable.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);

        Constructor<StudentEnum> declaredConstructor = StudentEnum.class.getDeclaredConstructor(String.class,int.class
                ,Student.class);
        declaredConstructor.setAccessible(true);
        Student student = new Student();
        student.setName("aaa");
        StudentEnum studentEnum = declaredConstructor.newInstance(student);
        Student student1 = studentEnum.getStudent();
        System.out.println(student1);

        StudentEnum s1 = StudentEnum.S1;
        StudentEnum s11 = StudentEnum.S1;
        System.out.println(s1 == s11);
        System.out.println(s1.getStudent()==(s11.getStudent()));
    }
}

enum EnumSingleton{
    INSTANCE;

    public static void print(){
        System.out.println("枚举实现单例");
    }

}

enum StudentEnum{
    S1(new Student()),
    S2(new Student());
    private Student student;

     StudentEnum(Student student) {
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }
}
