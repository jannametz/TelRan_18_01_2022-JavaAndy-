
import java.util.Comparator;

public class ComparatorNom implements Comparator<Cinema>, Sorting {
    @Override
    public int compare(Cinema go1, Cinema go2) {
        return go1.getName().compareTo(go2.getName());
    }
}


