package _4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try {
            System.out.println("Enter <Year><Month><Day>");
            //<2003><05><14>
            Scanner scanner = new Scanner(System.in);
            String ymd = scanner.nextLine();
            System.out.println("Enter <Hours><Minutes>");
            //<20><57>
            String hm = scanner.nextLine();
            String[] strYearMonthDay = ymd.substring(1, ymd.length() - 1).split("><");
            String[] strHoursMinutes = hm.substring(1, hm.length() - 1).split("><");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh/mm");
            Date date = sdf.parse(strYearMonthDay[0] + "/" +
                    strYearMonthDay[1] + "/" +
                    strYearMonthDay[2] + "/" +
                    strHoursMinutes[0] + "/" +
                    strHoursMinutes[1]);
            System.out.println(date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar.getTime());
        } catch (ParseException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input");
        }
    }
}
