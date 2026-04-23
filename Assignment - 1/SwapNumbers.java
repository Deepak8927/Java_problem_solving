/*
=========================================================================================
Problem Statement 10:
Write a Java program to swap two numbers.
=========================================================================================
*/

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Enter two numbers: 25 43
After swapping:
a = 43
b = 25
============================================================================
*/



