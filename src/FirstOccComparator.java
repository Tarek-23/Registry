import java.util.Comparator;
import java.util.Date;

public class FirstOccComparator implements Comparator<AbstractEvent> {
    @Override
    public int compare(AbstractEvent e1, AbstractEvent e2) {
        return e1.getStart_time().compareTo(e2.getStart_time());
    }
}


