import java.util.Comparator;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        Task task0 = new Task(0, "refactoring", "in Prozess", 24);
        Task task1 = new Task(1, "optimization of the software programm", "gemacht", 14);
        Task task2 = new Task(2, "user testing", "in Prozess", 4);
        Task task3 = new Task(3, "write the code", "gemacht", 1);
        Task task4 = new Task(4, "prototyping", "in Prozess", 22);
        Task task5 = new Task(5, "class diagram modeling ", "in Prozess", 90);
        Task task6 = new Task(6, "testing -> bags", "gemacht", 7);

        List<Programmer> programmerAll = List.of(
                new Programmer("Jack", "Berlin", List.of(task2)),
                new Programmer("Aleschka", "California", List.of(task4)),
                new Programmer("Marie", "New York", List.of(task1)),
                new Programmer("Leon", "London", List.of(task3)),
                new Programmer("Ema", "Sidney", List.of(task0)),
                new Programmer("Percy Maximilian", "London", List.of(task5)),
                new Programmer("Philip", "Madrid", List.of(task6)));


        System.out.println(programmerWorkedMoreThat5Day(programmerAll, 5));
        System.out.println(AufgabeInProzess(programmerAll));
        System.out.println(fNFibonacciNum(9));
    }


    /*Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач
     Task (int Number, String description, String status, int daysInProcessing) . Сформировать лист из всех задач,
     которые относятся к программистам из Берлина, не завершены (т.е. имеют статус, отличный от «done») и висят
     в обработке более 5 дней.*/

    public static List<Task> programmerWorkedMoreThat5Day(List<Programmer> program, int days) {
        return program.stream()
                .filter(p -> p.getCity().equals("London"))
                .flatMap(p -> p.getTasks().stream())
                .filter(t -> !t.getStatus().equals("done") && t.getDaysInProcess() > days)
                .collect(Collectors.toList());
    }

    /*Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач
      Task (int Number, String description, String status, int daysInProcessing) .
     Сформировать лист из дести задач которые дольше всего находятся в работе.*/

    public static List<Task> AufgabeInProzess(List<Programmer> program) {

        return program.stream()
                .flatMap(p -> p.getTasks().stream())
                .sorted(Comparator.comparing(Task::getDaysInProcess, Comparator.reverseOrder()))
                .limit(4)
                .collect(Collectors.toList());
    }

    //Используя стримы, сформировать список из первых N чисел Fibonacci.
    //I have used exemplar of this page.
    //https://www.anycodings.com/1questions/4026919/how-to-fetch-fibonacci-series-of-1-to-100-using-java-streams-and-add-it-into-a-map

    public static List<Integer> fNFibonacciNum(int nfibonacci) {
        ////Generate a stream of arrays like this {0,1}, {1, 1}
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(9)
                .map(s -> s[0])//gets each array, returning the first number from them, like 0 1 1 2 3
                .collect(Collectors.toList());
    }
}