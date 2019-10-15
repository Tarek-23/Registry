import java.util.Date;

public abstract class AbstractEvent {

    protected String description;
    protected Date start_date;
    protected Date end_date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public abstract void init();

    public abstract boolean hasMoreOccurences();

    public abstract Date nextOccurence();
}
