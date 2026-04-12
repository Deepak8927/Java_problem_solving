/*
=========================================================================================
Problem Statement 1:
Write a program to read two numbers from user and print their product.
=========================================================================================
*/

public class ProductNumbers {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int product = num1 * num2;
        System.out.println("Product: " + product);
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
cd <This file's path>
javac ProductNumbers.java
java ProductNumbers 12 15

Product: 180
============================================================================
*/