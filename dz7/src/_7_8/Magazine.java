package _7_8;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Magazine implements Printable {
    String header;

    Magazine (String header) {
        this.header = header;
    }
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }

    public void printMagazines (Printable[] printable) {
        for (Printable pr : printable) {
            if (pr instanceof Magazine)
                System.out.println(pr);
        }
    }

    public String toString () {
        return header;
    }
}
