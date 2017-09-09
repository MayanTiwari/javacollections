package OnlineBookReader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Created by mayan on 9/9/17.
 */
public final class  Book {
    public static Comparator<Book> BY_ID = Comparator.comparing(Book :: getBookID);
    public byte[] getBookContent() {
        return bookContent;
    }

    public void setBookContent(byte[] bookContent) {
        this.bookContent = bookContent;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Catagories getBookCatagory() {
        return bookCatagory;
    }

    public void setBookCatagory(Catagories bookCatagory) {
        this.bookCatagory = bookCatagory;
    }

    byte[] bookContent ;
    String bookName;
    int bookID;
    Catagories bookCatagory;
    List<String> notesList = new ArrayList<>();
    int lastPageVisited;

    public double getBookCost() {
        return bookCost;
    }

    public void setBookCost(double bookCost) {
        this.bookCost = bookCost;
    }

    double bookCost;

    public List<String> getNotesList() {
        return notesList;
    }

    public void setNotesList(List<String> notesList) {
        this.notesList = notesList;
    }

    public int getLastPageVisited() {
        return lastPageVisited;
    }

    public void setLastPageVisited(int lastPageVisited) {
        this.lastPageVisited = lastPageVisited;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookID != book.bookID) return false;
        return bookName != null ? bookName.equals(book.bookName) : book.bookName == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName,bookID);
    }
}
