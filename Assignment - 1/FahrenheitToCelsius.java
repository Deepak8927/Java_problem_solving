/*
=========================================================================================
Problem Statement 4:
Write a Java program to change temperature from Fahrenheit to Celsius.
=========================================================================================
*/

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 68;
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        System.out.println("Fahrenheit: "+fahrenheit);
        System.out.println("Celsius: "+celsius);
    }
    
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Fahrenheit: 68.0
Celsius: 20.0
============================================================================
*/
