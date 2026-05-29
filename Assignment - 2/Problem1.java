/*
=========================================================================================
Problem Statement 1:
Write a Java program to implement the concept of inheritance.
=========================================================================================
*/

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   
        d.bark(); 
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Animal is eating
Dog is barking
============================================================================
*/