import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(3);
//        list.add(6);
//        list.add(8);
//        list.add(-1);
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        final List<Cat> cats  = new ArrayList<>();
        cats.add(new Cat(1,2));
        cats.add(new Cat(5,3));
        cats.add(new Cat(5,5));
        cats.add(new Cat(7,1));
        cats.add(new Cat(8,1));
        cats.add(new Cat(3,8));
        cats.add(new Cat(4,8));

        System.out.println(cats);
        Collections.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
//                return o1.getAge()-o2.getAge();
                int i = o2.getAge() - o1.getAge();
                if (i >0){
                    return -1;
                }else if (i<0){
                    return 1;
                }else {
                    return o2.getPrice()-o1.getPrice();
                }
            }
        });

        System.out.println(cats);


    }
}

class Cat{
    private int price;
    private int age;

    public Cat(int price, int age) {
        this.price = price;
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "price=" + price +
                ", age=" + age +
                '}';
    }
}
