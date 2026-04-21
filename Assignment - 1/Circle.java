/*
=========================================================================================
Problem Statement 6:
Write a Java program to find area and perimeter of a circle.
=========================================================================================
*/

class Circle {
    public static void main(String[] args) {
        double radius = 7;

        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Area of Circle: 153.86
Perimeter of Circle: 43.96
============================================================================
*/
