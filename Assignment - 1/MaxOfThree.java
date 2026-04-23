/*
=========================================================================================
Problem Statement 9:
Write a Java program to find maximum of three numbers.
=========================================================================================
*/

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max;

        if (num1 >= num2 && num1 >= num3){
            max = num1;
        }
        else if (num2 >= num1 && num2 >= num3){
            max = num2;
        }
        else {
            max = num3;
        }
        System.out.println("Maximum: " + max);

        sc.close();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Enter three integers: 34 75 22 
Maximum: 75
============================================================================
*/


