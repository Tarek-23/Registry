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

    @Override
    public void init() {

    }

    @Override
    public boolean hasMoreOccurences() {
        return false;
    }

    @Override
    public Date nextOccurence(){
        return null;
    }

}
