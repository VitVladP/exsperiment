package old.sheduler;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        Calendar time = new GregorianCalendar();
        time.set(Calendar.HOUR,0);
        time.set(Calendar.MINUTE,30);
        time.set(Calendar.SECOND,0);
        System.out.println(time.getTime());
    }
}
