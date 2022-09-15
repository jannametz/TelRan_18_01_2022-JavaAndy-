import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList= List.of(1,8,127,27,55,72,45,13);
        System.out.println(closedValueofN(integerList, 9));
    }
    /*
        1. task
        Дан List<Integer>. Необходимо найти значение
        элемента максимально близкого к некоторому
        заданному значению N.
        */

    public static Integer closedValueofN(List<Integer > listInt, Integer val) {
        if (listInt == null || val == null) return null;
        return listInt.stream()
                .min(Comparator.comparing(c -> Math.abs(c - val))) 
                .orElseThrow(() -> new NoSuchElementException("No Such Element, is not found."));

    }

    /*
    2. task
    Дана строка вида ключ1:значение1;ключ2:
    значение2;ключ1:значение2;ключ3:значение1 .....
    Написать метод, который возвращает последнее значение заданного ключа.
    Например: "Jack:room 10;Nick:room 20;Jack:room 1;
    Mike:room3", "Jack" -> "room 1"
    Если в строке нет заданного ключа возвращается пустая строка.
    */

    // I still have to do it...............
}