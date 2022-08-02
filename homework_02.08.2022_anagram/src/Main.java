import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*Homework 02.08.2022 4. Анагра́мма — строка, составленная путем перестановки букв исходной строки,
 например “ABB CAA“ - “BA BCAA“ -> “CBA BAA“ ……
 В задаче дано 2 строки и символов латинского алфавита и пробелов,
 нужно определить, являются ли они анаграммами.
 Если знаете, предложите несколько алгоритмов\подходов к решению данной задачи.*/
        String a = "ABB CAA";
        String b = "BA BCAA";

        a = a.replace(" ", " ");
        b = b.replace(" ", " ");
        char arr1 [] = a.toCharArray();
        char arr2 [] = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean ergebnis = Arrays.equals(arr1,arr2);//
        if (ergebnis == true){
            System.out.println("Is anagram.");
        }else {
            System.out.println("Is not anagram.");
        }
    }
}