/*
=========================================================================================
Problem Statement 11:
Write a Java program to convert miles to kilometers.
=========================================================================================
*/

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in miles): ");
        double miles = sc.nextDouble();
        double km = miles * 1.609;
        System.out.println(miles + " Miles = " + km + " Kilometers.");

        sc.close();
    }
    
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Enter distance (in miles): 20
20.0 Miles = 32.18 Kilometers.
============================================================================
*/