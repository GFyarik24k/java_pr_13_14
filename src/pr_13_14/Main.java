package pr_13_14;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Exercise2 a = new Exercise2(2021,11,16);
        a.printCal();
        System.out.println("\n"+a.compare()+"\n");

        Exercise4 b = new Exercise4();
        Calendar cal = b.calendar(2021,11,12, 20,8);
        Date date = b.dataCreate("2021 11 12 20:08");
        b.readData(date);
        b.readCalendar(cal);

    }
}