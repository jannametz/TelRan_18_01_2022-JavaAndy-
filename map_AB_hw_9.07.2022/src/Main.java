import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TASK 1. Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’, то нужно
//создать новый ключ ‘ab’ с суммой значений от ключей a и b.
//Примеры:
//mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
//mapAB({"a": "Hi"}) → {"a": "Hi"}
//mapAB({"b": "There"}) → {"b": "There"}

public class Main {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        ConcatAB cAB1 = new ConcatAB("Hi ", "There");
        ConcatAB cAB2 = new ConcatAB("Hi", " ");
        ConcatAB cAB3 = new ConcatAB("There", " ");

        Map<String, ConcatAB> mapAB = new HashMap<>();
        mapAB.put(cAB1.getA() + cAB1.getB(), cAB1);
        mapAB.put(cAB2.getA() + cAB2.getB(), cAB2);
        mapAB.put(cAB3.getA() + cAB3.getB(), cAB3);
        System.out.println(mapAB);

        Set<String> key = mapAB.keySet(); //This method is used to return a Set view of the keys contained in this map.
        System.out.println(key);

    }
}





