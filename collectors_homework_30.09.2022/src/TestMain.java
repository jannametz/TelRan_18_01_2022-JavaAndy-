import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class TestMain {
   /*
   Дан список строк вида "a:11", "b:22", "a:13".... Необходимо получить Map<String, List<Integer>> где ключ это символ,
   а значение - список цифровых значений соответствующих символу.
   Пример:("a:11", "b:22", "a:13", "c:20", "a:10") -> {a=[11, 13, 10], b=[22], c=[20]}*/
        @Test
        void becommen_map_list(){
            List<String> l = List.of("a:11", "b:22", "a:13", "c:20", "a:10");
            Map<String, List<Integer>> mapping = Map.of("a", List.of(11,13,10), "b", List.of(22), "c", List.of(20));
            assertEquals(mapping, Main.becommenMap(l));
        }
        @Test
        void becommen_map_ONLYONE_element() {
            List<String> l = List.of("a:11");
            Map<String, List<Integer>> mapping = Map.of("a", List.of(11));
            assertEquals(mapping, Main.becommenMap(l));
        }
        @Test
        void becommen_map_empty() {
            List<String> l = List.of();
            Map<String, List<Integer>> mapping = Map.of();
            assertEquals(mapping, Main.becommenMap(l));
        }

        /*
        Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
        Необходимо получить Map<String, Double> где ключ это имя,
        а значение - сумма выплат.
        Пример ("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}*/

    }

