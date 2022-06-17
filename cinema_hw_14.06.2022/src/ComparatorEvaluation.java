import java.util.Comparator;

public class ComparatorEvaluation implements Comparator<Cinema>, Sorting {
    @Override
    public int compare(Cinema go1, Cinema go2) {
        return (int) (go1.getEvaluation() - go2.getEvaluation()) * 10;
    }
}

