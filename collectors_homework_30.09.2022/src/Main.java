import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        List<String> l = List.of("a:11", "b:22", "a:13", "c:20", "a:10");
        System.out.println(becommenMap(l));

        List<String> la = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");
        System.out.println(MapKeyNameAndSumPayments(la));


    }
    /*
    Дан список строк вида "a:11", "b:22", "a:13".... Необходимо получить Map<String, List<Integer>> где ключ это символ,
    а значение - список цифровых значений соответствующих символу. Пример:("a:11", "b:22", "a:13", "c:20", "a:10") -> {a=[11, 13, 10], b=[22], c=[20]}*/

    public static Map<String, List<Integer>> becommenMap(List<String> l) {
        Map<String, List<Integer>> term = l.stream()
                .collect(Collectors.groupingBy(e -> e.split(":")[0],
                        Collectors.mapping(e -> Integer.parseInt(e.split(":")[1]), Collectors.toList())));

        return term;
    }
    /*
    Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
    Необходимо получить Map<String, Double> где ключ это имя,
    а значение - сумма выплат. Пример:("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}*/
    public static Map<String, Double> MapKeyNameAndSumPayments(List<String> l) {

        return l.stream()
                .collect(Collectors.groupingBy(e -> e.split(":")[0],
                        Collectors.summingDouble(e -> Double.parseDouble(e.split(":")[1]))));


    }
}