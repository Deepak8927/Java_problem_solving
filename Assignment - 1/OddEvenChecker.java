/*
=========================================================================================
Problem Statement 7:
Write a Java Program to display whether a number is odd or even.
=========================================================================================
*/

public class OddEvenChecker {
    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0){
            System.out.println(num+" is an even number.");
        } 
        else {
            System.out.println(num+" is an odd number.");
        }
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
7 is an odd number.
============================================================================
*/