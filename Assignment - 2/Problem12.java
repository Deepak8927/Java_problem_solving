/*
=========================================================================================
Problem Statement 12:
Combine Question number 10 and 11 and have all the three classes together. Now describe
the working of all classes.
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

class OctNum extends Num {
    
    OctNum (int n){
        super(n);
    }

    @Override
    void shownum() {
        System.out.println("Octal Value: " + Integer.toOctalString(n));
    }
}

public class Problem12 {
    public static void main(String[] args) {
        Num num = new Num(199);
        HexNum hn = new HexNum(199);
        OctNum on = new OctNum(199);

        num.shownum();
        hn.shownum();
        on.shownum();
    }
}

/*
============================================================================
Sample Execution in Terminal
============================================================================
Integer Number: 199
Hexadecimal Value: C7
Octal Value: 307
============================================================================
*/