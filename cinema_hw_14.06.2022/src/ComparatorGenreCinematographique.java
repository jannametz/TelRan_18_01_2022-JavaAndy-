import java.util.Comparator;

public class ComparatorGenreCinematographique  implements Comparator<Cinema>, Sorting {
    @Override
    public int compare(Cinema go1, Cinema go2) {
        return go1.getGenre().compareTo(go2.getGenre());
    }
}


