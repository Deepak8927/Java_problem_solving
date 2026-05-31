/*
=========================================================================================
Problem Statement 11:
Write a Java program which creates a base class Num and contains an integer number along
with a method shownum() which displays the number. Now create a derived class OctNum which 
inherits Num and overrides shownum() which displays the octal value of the number. 
Demonstrate the working of the classes.
=========================================================================================
*/

class Num {
    protected int n;

    Num (int n){
        this.n = n;
    }

    void shownum() {
        System.out.println("Integer Number: " + n);
    }
}

class OctNum extends Num {
    
    OctNum (int n){
        super(n);
    }

    @Override
    void shownum() {
        System.out.println("Octal Value: " + Integer.toOctalString(n));
    }
}

public class Problem11 {
    public static void main(String[] args) {
        Num num = new Num(99);
        OctNum on = new OctNum(99);

        num.shownum();
        on.shownum();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Integer Number: 99
Octal Value: 143
============================================================================
*/