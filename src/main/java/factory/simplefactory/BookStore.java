package factory.simplefactory;

public class BookStore {
    public Book sellBook(String name){
        if ("yellow".equals(name)){
            return new YellowBook(name);
        }else if ("green".equals(name)){
            return new GreenBook(name);
        }else {
            return null;
        }
    }
}
