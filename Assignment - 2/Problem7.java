/*
=========================================================================================
Problem Statement 7:
An educational institution maintains a database of its employees. The database is divided
into a number of classes whose hierarchical relationships are shown below. Write all the 
classes and define the methods to create the database and retrieve individual information
as and when needed.
Write a driver program to test the classes.
Staff (code, name)                              Teacher (subject, publication) is a Staff
Officer (grade) is a Staff                      Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist        CasualTypist (daily wages) is a Typist. 
=========================================================================================
*/

class Staff {
    protected int code;
    protected String name;

    Staff (int code, String name){
        this.code = code;
        this.name = name;
    }

    void showData() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    Teacher (int code, String name, String subject, String publication){
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    void showData() {
        super.showData();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    void showData() {
        super.showData();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    void showData() {
        super.showData();
        System.out.println("Typing Speed: " + speed + " wpm");
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    RegularTypist(int code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    void showData() {
        super.showData();
        System.out.printf("Remuneration: %.2f%n", remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    CasualTypist(int code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    void showData() {
        super.showData();
        System.out.printf("Daily Wages: %.2f%n", dailyWages);
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Teacher t = new Teacher(
                101,
                "Rahul",
                "Java",
                "Programming with Java");

        Officer o = new Officer(
                102,
                "Amit",
                "A");

        RegularTypist rt = new RegularTypist(
                103,
                "Priya",
                60,
                25000);

        CasualTypist ct = new CasualTypist(
                104,
                "Neha",
                50,
                800);

        System.out.println("----- Teacher -----");
        t.showData();

        System.out.println("\n----- Officer -----");
        o.showData();

        System.out.println("\n----- Regular Typist -----");
        rt.showData();

        System.out.println("\n----- Casual Typist -----");
        ct.showData();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Code: 101
Name: Rahul
Subject: Java
Publication: Programming with Java

----- Officer -----
Code: 102
Name: Amit
Grade: A

----- Regular Typist -----
Code: 103
Name: Priya
Typing Speed: 60 wpm
Remuneration: 25000.00

----- Casual Typist -----
Code: 104
Name: Neha
Typing Speed: 50 wpm
Daily Wages: 800.00
============================================================================
*/
