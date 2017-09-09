package OnlineBookReader;

/**
 * Created by mayan on 9/9/17.
 */
public interface LibraryManager {
    void addBook(Book book);
    void updateBook(Book book);
    void removeBook(Book book);
    void freeTrial(Book book);
}
