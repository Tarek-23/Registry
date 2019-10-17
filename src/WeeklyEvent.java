import java.util.Date;

public class WeeklyEvent extends AbstractEvent {

    private Date limit;
    private Date current;

    public Date getLimit() {
        return limit;
    }

    public void setLimit(Date limit) {
        this.limit = limit;
    }

    @Override
    public void init() {
        current = addDays(start_time, -7);
    }

    @Override
    public boolean hasMoreOccurrences() {
        if (current == null)
            current = addDays(start_time, -7);
        return limit.after(addDays(current, 7));
    }

    @Override
    public Date nextOccurrence() {
        if (hasMoreOccurrences())
            current = addDays(current, 7);
        return current;
    }

    @Override
    public String toString() {
        return "WeeklyEvent{" +
                "description='" + description + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
