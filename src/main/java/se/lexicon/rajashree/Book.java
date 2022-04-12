package se.lexicon.rajashree;

public class Book {

    public String bookName;
    public Author bookAuthor;
    public String bookTitle;
    public String bookDescription;

    public Book(String bookName, Author bookAuthor, String bookTitle, String bookDescription) {
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

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
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

    public void getAuthorDetails(){
        System.out.println("Author name "+ bookAuthor.getAuthorName()+ "Author Id "+bookAuthor.getAuthorId());
    }


}
