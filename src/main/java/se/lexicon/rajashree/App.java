package se.lexicon.rajashree;

public class App {
    public static void main(String[] args){
        Car car = new Car("BMW","X70");
        car.drive(car);

        Rectangle rectangle = new Rectangle(20.8,10.7);

        double area = rectangle.getArea(rectangle.getHeight(), rectangle.getWidth());

        System.out.println(area);

    }
}
