package se.lexicon.rajashree;

public class App {
    public static void main(String[] args){
        Car volvo = new Car("1",2022,"VOLVO","Gray","150");
        //volvo.setYear(2020);
        volvo.drive();



        Rectangle rectangle = new Rectangle(20.8,10.7);
        double area = rectangle.getArea(rectangle.getHeight(), rectangle.getWidth());
        System.out.println(area);



        Author author1 = new Author(1,"test");
        Book book1 = new Book("Test1",author1,"JAVA","Java");
        author1.addBook(book1);
        author1.getAllBooksByAuthor();
        book1.getAuthorDetails();




        Author author2 = new Author(2,"test2");
        Book book2 = new Book("Test2",author2,"JAVA","Java");
        author2.addBook(book2);
        author2.getAllBooksByAuthor();
        book2.getAuthorDetails();



        Author[] authors = new Author[]{author2,author1};


        for(int k = 0; k< authors.length; k++){
            authors[k].getAllBooksByAuthor();;
        }


    }
}
