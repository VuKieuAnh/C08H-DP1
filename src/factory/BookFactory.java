package factory;

public class BookFactory {
    public static Book getBook(BookType type){
        switch (type){
            case PROGRAMBOOK:
                return new ProgramBook();
            case FICTIONBOOK:
                return new FictionBook();
            default:
                throw new IllegalArgumentException("Tham so khong dung");
        }
    }
}
enum SIZE{
    S, M, L
}