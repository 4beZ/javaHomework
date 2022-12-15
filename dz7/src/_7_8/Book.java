package _7_8;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Book implements Printable {
    String header;

    Book (String header) {
        this.header = header;
    }
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }

    public void printBooks (Printable[] printable) {
        for (Printable pr : printable) {
            if (pr instanceof Book)
                System.out.println(pr);
        }
    }

    public String toString () {
        return header;
    }
}
