package Inheritance;

// Base class
public class Bicycle {

    // Bicycle fields
    public int gear;
    public int speed;

    // Bicycle constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // Bicycle methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString()
    {
        return ("No of gears is " + gear + " and speed of bicycle is " + speed);
    }
}