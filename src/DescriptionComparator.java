import java.util.Comparator;

public class DescriptionComparator implements Comparator<String> {
    @Override
    public int compare(String desc_1, String desc_2) {
        return desc_1.compareToIgnoreCase(desc_2);

    }
}
