import java.util.Comparator;

public class ComparatorAnnee implements Comparator<Cinema>,Sorting {
    public int compare(Cinema go1, Cinema go2) {
        return go1.getJahr()-go2.getJahr();
    }
}


