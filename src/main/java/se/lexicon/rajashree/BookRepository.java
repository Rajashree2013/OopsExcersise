package se.lexicon.rajashree;

public class BookRepository {

    public static void main(String[] args) {
        Book book1 = new Book("COREJAVA-1", "RAJASHREE", "JAVA", "BOOK");
        Book book2 = new Book("COREJAVA-2", "RAJASHREE", "JAVA", "BOOK");
        Book book3 = new Book("COREJAVA-3", "RAJASHREE", "JAVA", "BOOK");
        Book book4 = new Book("MICROSOFT .NET1", "ULF", ".NET", "BOOK");
        Book book5 = new Book("MICROSOFT .NET2", "ULF", ".NET", "BOOK");
        Book book6 = new Book("MICROSOFT .NET3", "ULF", ".NET", "BOOK");
        Book book7 = new Book("ADVANCE JAVA1", "MARCUS", "OOPS", "BOOK");
        Book book8 = new Book("ADVANCE JAVA2", "MARCUS", "OOPS", "BOOK");
        Book book9 = new Book("ADVANCE JAVA3", "MARCUS", "OOPS", "BOOK");
        Book book10 = new Book("JAVA1", "Mehrdad", "SPRING", "BOOK");
        Book book11 = new Book("JAVA2", "Mehrdad", "SPRING", "BOOK");
        Book book12 = new Book("JAVA3", "Mehrdad", "SPRING", "BOOK");

        Author author1 = new Author("001", "RAJASHREE", new Book[]{book1, book2, book3});
        Author author2 = new Author("002", "ULF", new Book[]{book4, book5, book6});
        Author author3 = new Author("003", "MARCUS", new Book[]{book7, book8, book9});
        Author author4 = new Author("004", "Mehrdad", new Book[]{book10, book11, book12});

        Author[] authors = new Author[]{author1, author2, author3, author4};

        BookRepository bookRepository = new BookRepository();

        bookRepository.getAllBooksForSpecificAuthor("RAJASHREE", authors);
        bookRepository.getAuthorForBook("MICROSOFT .NET2", authors);


    }


    public void getAllBooksForSpecificAuthor(String authorName, Author[] authors) {

        for (int i = 0; i < authors.length; i++) {
            if (authors[0].getAuthorName() == authorName) {
                Book[] books = authors[0].getBook();
                for (int j = 0; j < books.length; j++) {
                    String book = books[j].bookName;
                    System.out.println("Book-------->"+book);
                }
                break;
            }
        }
    }

    public void getAuthorForBook(String bookName, Author[] authors) {

        for (int i = 0; i < authors.length; i++) {
            Book[] books = authors[i].getBook();
            for (int j = 0; j < books.length; j++) {
                String book = books[j].bookName;
                if (bookName == book) {
                    System.out.println("Author-------->"+authors[i].getAuthorName());
                }
            }

        }
    }
}
