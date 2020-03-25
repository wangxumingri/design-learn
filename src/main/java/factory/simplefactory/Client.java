package factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用if...else");
        BookStore bookStore = new BookStore();
        Book yellowBook = bookStore.sellBook("yellow");
        yellowBook.print();

        System.out.println("使用简单工厂方法模式");

        BookStoreB bookStoreB = new BookStoreB();
        Book greenBook = bookStoreB.sellBook("green");
        greenBook.print();
    }
}
