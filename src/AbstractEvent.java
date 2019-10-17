import java.util.Calendar;
import java.util.Date;

public abstract class AbstractEvent {

    protected String description;
    protected Date start_time;
    protected Date end_time;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_date) {
        this.start_time = start_date;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_date) {
        this.end_time = end_date;
    }

    public abstract void init();

    public abstract boolean hasMoreOccurrences();

    public abstract Date nextOccurrence();

    protected static Date addDays(Date currentDate, int days) {
        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date
        c.add(Calendar.DATE, days);

        // convert calendar to date
        Date new_date = c.getTime();
        return new_date;
    }
}
