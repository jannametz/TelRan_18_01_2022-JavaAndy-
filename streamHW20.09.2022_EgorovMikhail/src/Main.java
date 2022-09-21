import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Studenten s1 = new Studenten("Sergey", "m", 22, 3, 8.3);
        Studenten s2 = new Studenten("Nik", "m", 28, 2, 7.4);
        Studenten s3 = new Studenten("Elena", "w", 32, 1, 9.0);
        Studenten s4 = new Studenten("Peter", "m", 30, 4, 6.0);
        Studenten s5 = new Studenten("Marya", "w", 21, 5, 7.7);


        // List<Studenten>allStudentenList = List.of(s1,s2,s3,s4,s5);
        List<Studenten> studentenList1 = List.of(s4, s5);
        List<Studenten> studentenList2 = List.of(s1, s2, s3);


        FakultatInUniversitat f1 = new FakultatInUniversitat("C++", studentenList1);
        FakultatInUniversitat f2 = new FakultatInUniversitat("Java", studentenList2);

        List<FakultatInUniversitat> FakultatList = new ArrayList<>();
        FakultatList.add(f1);
        FakultatList.add(f2);
        System.out.println(FakultatList);

        ageMore22(studentenList1);
        more22(studentenList2);
        NameOfStudenten(FakultatList);

    }

    public static void ageMore22(List<Studenten> studentenList) { //  //1. отфильтровать студентов age>22 а вывести на экран только одного [use  limit ]
        studentenList.stream()
                .filter(s -> s.getAge() > 22)
                .limit(1)
                .forEach(s -> System.out.println(s));
    }

    public static void more22(List<Studenten> studentenList) { //2. отфильтровать студентов age>22 , вывести на экран пропустить первого(есть метод для пропуска)
        studentenList.stream()
                .filter(s -> s.getAge() > 22)
                .skip(1) //метод для пропуска)
                .forEach(s -> System.out.println(s));
        // .forEach(System.out::println);
    }

    public static void NameOfStudenten(List<FakultatInUniversitat> FakultatList) { ////3.Вывести имена всех студентов на всех факультетах
        FakultatList.stream()
                .flatMap(f -> f.getStudenten().stream()
                        .map(s -> s.getName()))
                .forEach(s -> System.out.print(" " + s));
    }

}

