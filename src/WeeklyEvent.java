import java.util.Date;

public class WeeklyEvent extends AbstractEvent {

    private Date limit;

    public Date getLimit() {
        return limit;
    }

    public void setLimit(Date limit) {
        this.limit = limit;
    }

    @Override
    public void init() {

    }

    @Override
    public boolean hasMoreOccurrences() {
        return false;
    }

    @Override
    public Date nextOccurrence() {
        return null;
    }
}
