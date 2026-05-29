/*
=========================================================================================
Problem Statement 4:
Write a Java program to show method hiding.
=========================================================================================
*/

class Parent {
    static void display() {
        System.out.println("Static method of Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method of Child class");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Parent.display();
        Child.display();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Static method of Parent class
Static method of Child class
============================================================================
*/