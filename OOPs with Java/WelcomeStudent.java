
/*
=========================================================================================
Problem Statement 3:
Write a program to send the name and surname of a student through command line arguments
and print a welcome message for the student.
=========================================================================================
*/

public class WelcomeStudent {
    public static void main(String[] args) {
        String firstname = args[0];
        String lastname = args[1];

        System.out.println("Welcome, " + firstname + " " + lastname + "!");
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
cd <This file's path>
javac WelcomeStudent.java
java WelcomeStudent Peter Parker

Welcome, Peter Parker!
============================================================================
*/