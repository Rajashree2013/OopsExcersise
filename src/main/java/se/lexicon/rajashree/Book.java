package se.lexicon.rajashree;

public class Book {

    public String bookName;
    public String bookAuthor;
    public String bookTitle;
    public String bookDescription;

    public Book(String bookName, String bookAuthor, String bookTitle, String bookDescription) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
