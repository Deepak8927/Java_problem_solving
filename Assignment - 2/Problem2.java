/*
=========================================================================================
Problem Statement 2:
Write a Java program to show method overloading.
=========================================================================================
*/

class Addition {

    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void add(int a, int b, int c){
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two decimal numbers: " + (a + b));
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Addition ad = new Addition();
        
        ad.add(34, 56);
        ad.add(21, 45, 66);
        ad.add(34.5, 53.3); 
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Sum of two numbers: 90
Sum of three numbers: 132
Sum of two decimal numbers: 87.8
============================================================================
*/