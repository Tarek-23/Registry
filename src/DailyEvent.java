import java.util.Date;

public class DailyEvent extends AbstractEvent{

    private int recurrences;
    private int reps = 0;

    // getter and setter for recurrences
    public int getRecurrences() {
        return recurrences;
    }
    public void setRecurrences(int recurrences) {
        this.recurrences = recurrences;
    }

    @Override
    public void init() {
        reps = 0;
    }

    @Override
    public boolean hasMoreOccurrences() {
        return reps < recurrences - 1;
    }

    @Override
    public Date nextOccurrence(){
        if (hasMoreOccurrences())
            return addDays(start_time, reps++);

        else return addDays(start_time, reps);
    }

    @Override
    public String toString() {
        return "DailyEvent{" +
                "description='" + description + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
