package OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayan on 9/9/17.
 */
public class Library implements LibraryManager{

    Map<Integer,Book> bookList = new HashMap<>();
    @Override
    public void addBook(Book book) {
        if(!bookList.containsKey(book.bookID)){
            bookList.put(book.getBookID(),book);
        }
    }

    @Override
    public void updateBook(Book book) {
        if(bookList.containsKey(book.getBookID())){
            //Book book = bookList.get(book.getBookID());
            //Update book.
        }
    }

    @Override
    public void removeBook(Book book) {
        if(!bookList.containsKey(book.bookID)){
            bookList.remove(book.getBookID());
        }
    }
    @Override
    public void freeTrial(Book book) {

    }
}
