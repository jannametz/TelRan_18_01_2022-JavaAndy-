
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {

        String string = "broccoli broccoli onion onion potato carrot pumpkin avocado";
        System.out.println(countWordWithSeparatedSpace(string));

        List<Person> leute = List.of( new Person("Viki", "Kuadros", 21),
                new Person("Percy", "Bankes", 17),
                new Person("Percy", "Percy", 22),
                new Person("Max-Percy", "Metz", 18),
                new Person("Lio", "Waller", 30) );
        System.out.println(useStreamGetMap(leute));

        List<Student> l1 = List.of(
                new Student("Percy Maximilian", "Metz", 100.0),
                new Student("Anna", "Taylor", 30.0),
                new Student("Nikol", "Brown", 45.2),
                new Student("Inna", "Gogo", 56.0),
                new Student("Oliver", "Williams", 80.0));
        List<Student> l2 = List.of(
                new Student("Martin", "Kostenko", 60.0),
                new Student("Mischel", "Metz", 68.0),
                new Student("Mascha", "Xrustolova", 69.9),
                new Student("Tom", "King", 70.0),
                new Student("Angelina", "Thompson", 90.0) );


        List<Group> group = List.of(new Group("X ->",l1 ),
                new Group("Y ->",l2 ));
        System.out.println(group);
        System.out.println("Successful Students: " + successfulStudentsFromAllGroup(group));


    }

    /*
    1.Дана строка (для простоты можно считать,  слова разделены одним пробелом и строка не содержит знаков препинание и т.д.).
    Используя стрим, получить map<String, Integer> где ключ – слово, значение – сколько раз это слово встречается в строке.
    */
    public static Map<String, Integer>countWordWithSeparatedSpace(String s){
        Map<String, Integer> res = Arrays.stream(s.toLowerCase().split(" ")).collect(Collectors.toMap(word-> word, word-> 1, Integer::sum));
        return res;
    }

    /*
    2.Дан список Person (String firstName, String lastName, int age) используя Stream получить map<String, Integer>,
     где ключ ФИО в формате Иванов.И, значение возраст.
     */

    public static Map<String, Integer> useStreamGetMap(List<Person> l){
        return l.stream()
                .collect(Collectors.toMap(s -> s.getLName() + "." + s.getFName().substring(0,1), Person::getAge));
    }

    /*
    3.     Дан список Group(String title,  Students[] students), Student(String firstName, String lastName, Double rate).
    Используя Stream получить map<String, Double>, где ключ ФИО студента в формате Иванов.И, значение – рейтинг.
    В map должны попасть первые 3 самых успевающих студента из каждой группы. В данной задаче, предполагается, что студентов-однофамильцев нет.
    */

    public static Map<String, Double> successfulStudentsFromAllGroup(List<Group>group) {
        return group.stream()
                .flatMap(g -> g.getStudents()
                        .stream()
                        .sorted(Comparator.comparing(Student::getRate, Comparator.reverseOrder())).limit(2)).collect(Collectors.toMap(Student::getFName, Student::getRate));
    }
}
