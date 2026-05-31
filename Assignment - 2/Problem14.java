/*
=========================================================================================
Problem Statement 14:
Create a base class called “vehicle” that stores number of wheels and speed.
Create the following derived classes –
“car” that inherits “vehicle” and also stores number of passengers.
“truck” that inherits “vehicle” and also stores the load limit.
Write a main function to create objects of these two derived classes and display all
the information about “car” and “truck”. Also compare the speed of these two
vehicles - car and truck and display which one is faster.
=========================================================================================
*/

class Vehicle {
    protected int wheels, speed;

    Vehicle (int wheels, int speed){
        this.wheels = wheels;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("No. of Wheels: " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int passengers;
    Car (int wheels, int speed, int passengers){
        super(wheels, speed);
        this.passengers = passengers;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("No. of Passengers: " + passengers);
    }
}

class Truck extends Vehicle {
    private double load;
    Truck (int wheels, int speed, double load){
        super(wheels, speed);
        this.load = load;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Loading Capacity: " + load + " ton");
    }
}

public class Problem14 {
    public static void main(String[] args) {
        Car car = new Car(4, 200, 6);
        Truck truck = new Truck(8, 120, 4);

        System.out.println("----- Car Details -----");
        car.showDetails();

        System.out.println("\n----- Truck Details -----");
        truck.showDetails();

        if (car.speed > truck.speed){
            System.out.println("\nCar is faster than truck.");
        }
        else {
            System.out.println("\nTruck is faster than car.");
        }
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
----- Car Details -----
No. of Wheels: 4
Speed: 200 km/h
No. of Passengers: 6

----- Truck Details -----
No. of Wheels: 8
Speed: 120 km/h
Loading Capacity: 4.0 ton

Car is faster than truck.
============================================================================
*/