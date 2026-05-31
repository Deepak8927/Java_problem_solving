/*
=========================================================================================
Problem Statement 13:
Create a base class Distance which stores the distance between two locations in miles and
a method travelTime(). The method prints the time taken to cover the distance when the 
speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so 
that it prints the time assuming the distance is in kilometers and the speed is 100 km
per second. Demonstrate the working of the classes.
=========================================================================================
*/

class Distance {
    protected double distance;

    Distance (double distance){
        this.distance = distance;
    }

    void travelTime() {
        double time = distance / 60.0;

        System.out.println("Distance = " + distance + " miles");
        System.out.printf("Travel Time = %.2f hours%n", time);
    }
}

class DistanceMKS extends Distance {
    
    DistanceMKS(double distance) {
        super(distance);
    }

    @Override
    void travelTime() {
        double time = distance / 100.0;

        System.out.println("Distance = " + distance + " km");
        System.out.printf("Travel Time = %.2f hours%n", time);
    }
}

public class Problem13 {
    public static void main(String[] args) {

        Distance d1 = new Distance(300);
        DistanceMKS d2 = new DistanceMKS(300);

        System.out.println("Using Distance Class");
        d1.travelTime();

        System.out.println("\nUsing DistanceMKS Class");
        d2.travelTime();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Using Distance Class
Distance = 300.0 miles
Travel Time = 5.00 hours

Using DistanceMKS Class
Distance = 300.0 km
Travel Time = 3.00 hours
============================================================================
*/