package se.lexicon.rajashree;

public class App {
    public static void main(String[] args){
        Car volvo = new Car("1",2022,"VOLVO","Gray","150");
        //volvo.setYear(2020);
        volvo.drive();



        Rectangle rectangle = new Rectangle(20.8,10.7);
        double area = rectangle.getArea(rectangle.getHeight(), rectangle.getWidth());
        System.out.println(area);

    }
}
