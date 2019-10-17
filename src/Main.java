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
        System.out.println(d);
        d.init();
        System.out.println(d.nextOccurrence());


        WeeklyEvent w = new WeeklyEvent();
        w.setStart_time(dat);
        w.setLimit(AbstractEvent.addDays(w.getStart_time(), 30));
        for (int i = 0; i < 5; i++) {
            System.out.println(w.nextOccurrence());
        }
        System.out.println(w);
        w.init();
        System.out.println(w.nextOccurrence());
    }
}
