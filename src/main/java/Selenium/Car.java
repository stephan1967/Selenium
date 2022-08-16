package Selenium;

public class Car {

    private String make;
    private String model;
    private String colour;
    public String frodo = "yekkel";
     static final String blijfVanMijAf = "cant touch this";

    public Car(String make, String model, String colour) {
        // Constructors in Java
        // In Java, a constructor is a block of codes similar to the method. It is called when an instance of the
        // class is created. At the time of calling constructor, memory for the object is allocated in the memory.
        // It is a special type of method which is used to initialize the object.
        // Every time an object is created using the new() keyword, at least one constructor is called.
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public String getMake() {        return make;
    }

    public String getModel() {        return model;
    }

    public String getColour() {        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", frodo='" + frodo + '\'' +
                '}';
    }

    public static void main(String[] args){
        Car car1 = new Car("Ford", "Ecosport" , "Red");
        car1.getColour();
        car1.frodo = "furocouis";
        System.out.print(car1);
    }

}
