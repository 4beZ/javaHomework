package _5_6;

import java.awt.print.Printable;

public class Main {
    public static void main (String[] args) {
        StringFuncs ps = new ProcessStrings();
        System.out.println(ps.numberOfSymbols("Hello"));
        System.out.println(ps.invert("Hello"));
        System.out.println(ps.somethingWeird("Hello"));
    }
}
