package factory;

public class Client {
    public static void main(String[] args) {
        //ko co factory
        Book b = new FictionBook();
        //co factory
        String type = "A";

        Book b2 = BookFactory.getBook(BookType.PROGRAMBOOK);
    }
}
