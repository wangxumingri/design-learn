package factory.simplefactory;

/**
 * 第二个书店
 */
public class BookStoreB {
    public Book sellBook(String name){
        return SimpleBookFactory.createBook(name);
    }
}
