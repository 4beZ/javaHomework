package _1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date initialDate = sdf.parse("01/09/2022");
        Date currentDate = new Date();
        System.out.println("Author: Alex Bezuglov");
        System.out.println("Task received: " + initialDate);
        System.out.println("Task completed: " + currentDate);
    }
}