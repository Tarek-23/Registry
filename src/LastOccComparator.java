import java.util.Comparator;
import java.util.Date;

public class LastOccComparator implements Comparator<AbstractEvent> {
    @Override
    public int compare(AbstractEvent e1, AbstractEvent e2) {
        while (e1.hasMoreOccurrences() || e2.hasMoreOccurrences()){
            e1.nextOccurrence(); e2.nextOccurrence();
        }
        return e1.nextOccurrence().compareTo(e2.nextOccurrence());
    }
}
