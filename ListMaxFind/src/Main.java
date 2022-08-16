import java.util.*;
/*Реализовать обобщенный метод поиска максимального
элемента в любом допустимом лис
 */

public class Main {
    public static void main(String[] args) {
                List<Integer> list = new ArrayList<Integer>();
                try {
                    list.add(14);
                    list.add(88);
                    list.add(3);
                    System.out.println("Maximum: " + Collections.max(list));
                }
                catch (ClassCastException | NoSuchElementException e) {
                    System.out.println("Exception: " + e);
                }
    }
}