
/*
=========================================================================================
Problem Statement 2:
Write a program to print the square of a number passed through commandline arguments.
=========================================================================================
*/

public class SquareNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int square = num*num;

        System.out.println("Square: " + square);
    }

}

/*
============================================================================
Sample Execution in Terminal
============================================================================
cd <This file's path>
javac SquareNumber.java
java SquareNumber 12

Square: 144
============================================================================
*/