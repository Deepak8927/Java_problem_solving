/*
=========================================================================================
Problem Statement 3:
Write a Java program to show method overriding. 
=========================================================================================
*/

class Animal {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog makes barking sound.");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();   
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Dog makes barking sound.
============================================================================
*/