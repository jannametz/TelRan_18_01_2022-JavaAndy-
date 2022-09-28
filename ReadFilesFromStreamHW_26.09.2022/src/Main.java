
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        /*zu Aufgabe I*/
        List<String> list1 = Arrays.asList("apple", "banana", "lemon", "orange", "apple");
        System.out.println(streamToMapAKeyFirstLetter(list1));

        /*zu Aufgabe II*/
        List<String> list = Arrays.asList("Linux", "Windows", "Mac");
        System.out.println(mergeFunctionString(list));

        /*zu Aufgabe III*/
        Path path = Paths.get("/Users/janametz/myProjects/ReadFilesFromStreamHW_26.09.2022/src/readAllTextFileLinie");
        System.out.println(readFileToStringAndMerge(path));

        // LEVER TWO
        String contents = Files.readString(Paths.get("/Users/janametz/myProjects/ReadFilesFromStreamHW_26.09.2022/src/readAllTextFileLinie"));
        System.out.println(countWort(contents));
        System.out.println(uniqueWordCount(contents));
        System.out.println(countWord(contents));

    }

    /*
       I. "apple", "banana", "lemon", "orange" - даны такие слова
       преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
       {a=apple, b=banana, l=lemon, o=orange}
       Map<String, String> fruits = Stream.of("apple", "banana", "lemon", "orange")
       .collect(Collectors.toMap(e -> e.substring(0, 1), e -> e));
        */
    public static Map<String, String> streamToMapAKeyFirstLetter(List<String> list) {
        if
        (list.isEmpty() || list == null) return Map.of();
        return list.stream()
                .collect(Collectors.toMap(e -> e.substring(0, 1), e -> e, (e1, e2) -> e2));
    }

    /*
      II. "Linux", "Windows", "Mac" - даны такие слова
      Объединение нескольких строк в одну
      String myString = list.stream().collect(Collectors.joining(", "));
      */
    public static String mergeFunctionString(List<String> l) {
        return l.stream().collect(Collectors.joining(", "));
    }

    /*
      Path path = Paths.get(путьдофайла);
      Прочитать все строки текстового файла и объединить их в одну строкуп
    */
    public static String readFileToStringAndMerge(Path path) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader read = new BufferedReader(new FileReader(String.valueOf(path)));

            String str; //readLine returns null when there are no more lines
            while ((str = read.readLine()) != null) {
                sb.append(str.replaceAll(" ", " "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    //LEVER TWO
/*
    Second level: String contents = new String(Files.readAllBytes(Paths.get("src/main/java/WarAndPease.txt")), StandardCharsets.UTF_8); - "src/main/java/WarAndPease.txt это ссылка на какой либо текст.
    Необходимо прости стримом по тексту написать метод который считает количество уникальных слов
    long count = words.stream().distinct().count(); И
    количество повторений
    long countWithRepeat =тут тоже будет стрим
    тут обработать String contents
    System.out.println("Слов всего " + countWithRepeat);
    System.out.println("Уникальных слов  " + count);
    P|S Используйте так же регулярные выражения. Это задание было на собеседование в EPAM
    */

    public static long uniqueWordCount(String s) {
        long count_unique = Stream.of(s.split("\\s+|(?<=[a-z])(?=[a-z])"))
                .distinct()
                .count();
        return count_unique;
    }

    public static long countWort(String s) {
        long count = Stream.of(s.split("\\s+|(?<=[a-z])(?=[a-z])"))
                .count();
        return count;
    }

    /*
    Есть стринга
    14:13 Uhr
    Нужно вывести каждое слово и количество его повторений одним стримом
    */
    public static Map<String, Integer> countWord(String s) {
        Map<String, Integer> m = Stream.of(s.split("\\s+|(?<=[a-z])(?=[a-z])"))
                .collect(Collectors.toMap(e -> e, e -> 1, (e1, e2) -> e1 + 1));
        return m;
    }

}