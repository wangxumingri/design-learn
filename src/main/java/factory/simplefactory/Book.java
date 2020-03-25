package factory.simplefactory;

import lombok.*;

@Data
@AllArgsConstructor
public  abstract class Book {
    public String name;

    public void print(){
        System.out.println("这是一本"+name+"书");
    }
}
