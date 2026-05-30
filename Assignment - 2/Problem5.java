/*
=========================================================================================
Problem Statement 5:
Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. 
The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). 
Override these two methods in each of the derived classes to calculate the volume and 
whole surface area of each type of three-dimensional objects. 
The dimensions of the objects are to be taken from the users and passed through the respective
constructors of each derived class. Write a main method to test these classes.
=========================================================================================
*/

import java.util.Scanner;

class ThreeDObject {
    double wholeSurfaceArea() {
        return 0;
    }
    double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2*(l*b + b*h + h*l);
    }

    @Override
    double volume(){
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume(){
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    double volume(){
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    @Override
    double volume(){
        return (Math.PI * r * r * h) / 3;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, breadth and height of box: ");
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter side of Cube: ");
        Cube cube = new Cube(sc.nextDouble());

        System.out.print("Enter radius and height of Cylinder: ");
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter radius and height of Cone: ");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());

        System.out.println("\nBOX");
        System.out.println("Surface Area = " + box.wholeSurfaceArea());
        System.out.println("Volume = " + box.volume());

        System.out.println("\nCUBE");
        System.out.println("Surface Area = " + cube.wholeSurfaceArea());
        System.out.println("Volume = " + cube.volume());

        System.out.println("\nCYLINDER");
        System.out.printf("Surface Area = %.2f%n", cylinder.wholeSurfaceArea());
        System.out.printf("Volume = %.2f%n", cylinder.volume());

        System.out.println("\nCONE");
        System.out.printf("Surface Area = %.2f%n", cone.wholeSurfaceArea());
        System.out.printf("Volume = %.2f%n", cone.volume());

        sc.close();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Enter length, breadth and height of box: 32 64 11
Enter side of Cube: 11
Enter radius and height of Cylinder: 3 6 
Enter radius and height of Cone: 4 2

BOX
Surface Area = 6208.0
Volume = 22528.0

CUBE
Surface Area = 726.0
Volume = 1331.0

CYLINDER
Surface Area = 169.65
Volume = 169.65

CONE
Surface Area = 106.46
Volume = 33
============================================================================
*/