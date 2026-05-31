/*
=========================================================================================
Problem Statement 10:
Write a Java program which creates a base class Num and contains an integer number along 
with a method shownum() which displays the number. Now create a derived class HexNum which
inherits Num and overrides shownum() which displays the hexadecimal value of the number. 
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

class HexNum extends Num {
    
    HexNum (int n){
        super(n);
    }

    @Override
    void shownum() {
        System.out.println("Hexadecimal Value: " + 
                Integer.toHexString(n).toUpperCase());
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Num num = new Num(255);
        HexNum hn = new HexNum(255);

        num.shownum();
        hn.shownum();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Integer Number: 255
Hexadecimal Value: FF
============================================================================
*/