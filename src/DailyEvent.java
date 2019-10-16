import java.util.Calendar;
import java.util.Date;

public class DailyEvent extends AbstractEvent{

    public int getRecurrences() {
        return recurrences;
    }

    public void setRecurrences(int recurrences) {
        this.recurrences = recurrences;
    }

    private int recurrences;
    private int reps = 0;

    @Override
    public void init() {
        reps = 0;
    }

    @Override
    public boolean hasMoreOccurrences() {
        return reps < recurrences;
    }

    @Override
    public Date nextOccurrence(){
        if (hasMoreOccurrences()) {
           // reps++;
            return addDays(start_time, ++reps);
        }
        else return addDays(start_time, reps);
    }

}
