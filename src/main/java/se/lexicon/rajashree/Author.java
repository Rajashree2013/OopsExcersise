package se.lexicon.rajashree;

import java.util.Arrays;

public class Author {
    public int authorId;
    public String authorName;
    public Book[] books;


    public Author(int authorId, String authorName) {
        this.books= new Book[0];
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void getAllBooksByAuthor(){
        // step1: travers on array
        // step2: print it
        for(int i = 0; i< books.length; i++){
            System.out.println("Book Name: " + books[i].getBookName() + " Book Title: "+ books[i].getBookTitle());
        }
    }

    public void addBook(Book book){
        if (books != null){
            if (book != null){
                Book[] tmp = Arrays.copyOf(books, books.length + 1);
                tmp[tmp.length - 1] = book;
                books = tmp;
            }
        }

    }
}
