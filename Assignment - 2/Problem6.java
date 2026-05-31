/*
=========================================================================================
Problem Statement 6:
Write a program to create a class named Vehicle having protected instance variables regnNumber,
speed, color, ownerName and a method showData ( ) to show “This is a vehicle class”.
Inherit the Vehicle class into subclasses named Bus and Car having individual private instance
variables routeNumber in Bus and manufacturerName in Car and both of them having showData ( ) 
method showing all details of Bus and Car respectively with content of the super class’s
showData ( ) method.
=========================================================================================
*/

class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    Vehicle(String regnNumber, int speed, String color, String ownerName){
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(String regnNumber, int speed, String color, 
        String ownerName, int routeNumber){
        
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    void showData () {
        super.showData();

        System.out.println("Bus Details");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, int speed, String color, 
        String ownerName, String manufacturerName){
        
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData () {
        super.showData();

        System.out.println("Car Details");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Bus bus = new Bus(
            "JH09A9999", 
            60, 
            "Green", 
            "Jaykant", 
            24
        );

        Car car = new Car(
            "JH01B7777", 
            180, 
            "Red", 
            "Harshdeep", 
            "Tata"
        );

        System.out.println("----- BUS -----");
        bus.showData();

        System.out.println("\n----- CAR -----");
        car.showData();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
----- BUS -----
This is a vehicle class.
Bus Details
Registration Number: 
Speed: 60
Color: Green
Owner Name: Jaykant
Route Number: 24

----- CAR -----
This is a vehicle class.
Car Details
Registration Number: JH01B7777
Speed: 180
Color: Red
Owner Name: Harshdeep
Manufacturer Name: Tata
============================================================================
*/
