
import java.util.ArrayList;
import java.util.*;
public class Main {
    /**Дан лист Integer. Необходимо написать метод,
     который возвращает лист аналогичный заданному, но "перевернутый" задом на перед.
 (1, 4,2,9) ->(9,2,4,1)*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> inverted = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(9);

        Collections.reverse(list);
        System.out.println(list);
    }
}






