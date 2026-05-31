/*
=========================================================================================
Problem Statement 15:
Write a Java program to explain “multilevel inheritance.” 
=========================================================================================
*/

class Student {
    protected int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    void showRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}

class Exam extends Student {
    protected int marks1, marks2;

    Exam(int rollNo, int marks1, int marks2) {
        super(rollNo);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void showMarks() {
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
    }
}

class Result extends Exam {
    int total;

    Result(int rollNo, int marks1, int marks2) {
        super(rollNo, marks1, marks2);
        total = marks1 + marks2;
    }

    void showResult() {
        showRollNo();
        showMarks();
        System.out.println("Total Marks: " + total);
    }
}

public class Problem15 {
    public static void main(String[] args) {

        Result r = new Result(101, 85, 90);

        System.out.println("Student Result");
        r.showResult();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Student Result
Roll Number: 101-
Marks in Subject 1: 85
Marks in Subject 2: 90
Total Marks: 175
============================================================================
*/