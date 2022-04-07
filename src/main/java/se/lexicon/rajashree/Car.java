package se.lexicon.rajashree;

public class Car {
    //id, year, model, colour, motorSize
    private String id;
    private int year;
    private String model;
    private String color;
    private String motorSize;

    public Car(String model, String motorSize) {
        this.model = model;
        this.motorSize = motorSize;
    }

    // constructor
    public Car(String id, int year, String model, String color, String motorSize) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
    }






    // Methods
    public void drive(Car car) {
        System.out.println(car.model +" with motor "+ car.motorSize +" can drive now");

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }
}