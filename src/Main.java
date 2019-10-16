import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date dat = c.getTime();
        DailyEvent d = new DailyEvent();
        d.setRecurrences(3);
        d.setStart_time(dat);
        for (int i = 0; i < 4; i++) {
            System.out.println(d.nextOccurrence());
        }
    }
}
