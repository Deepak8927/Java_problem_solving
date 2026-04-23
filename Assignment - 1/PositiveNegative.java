/*
=========================================================================================
Problem Statement 8:
Write a Java Program to check if a number is Positive or Negative.
=========================================================================================
*/
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num < 0){
            System.out.println(num + " is a negative Integer.");
        }
        else {
            System.out.println(num + " is a positive Integer.");
        }

        sc.close();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Enter an integer: 34
34 is a positive Integer.
============================================================================
*/
