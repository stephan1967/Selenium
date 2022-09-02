package Inheritance;

// derived/sub class
class MountainBike extends Bicycle {

    // MountainBike subclass adds one more field
    public int seatHeight;

    // MountainBike constructor
    public MountainBike(int gear, int speed, int startHeight)  {
        // invoking base-class(Bicycle) constructor

//        The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//        Whenever you create the instance of subclass, an instance of parent class is created implicitly which is
//        referred by super reference variable.

        super(gear, speed);
        seatHeight = startHeight;
    }
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more info.....
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

