
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import  java.util.ArrayList;
public class Main {
    /*Создать класс Film и полями класса: название, жанр, рейтинг, год ;
     Создать список фильмов. Программа должна спрашивать какая сортировка
     нужна пользователю (по названию, по рейтингу, по жанру или году)
     и выводить отсортированный список на экран.*/

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(new Cinema("The Batman", "Action, Crime", 7.5f, 2022));
        cinemaList.add(new Cinema("Avatar'The Way of Water'", "Fentaci", 9.1f, 2022));
        cinemaList.add(new Cinema("Gladiator", "History", 11.1f, 2000));
        cinemaList.add(new Cinema("Sissi", "History", 5.8f, 1955));
        cinemaList.add(new Cinema("The Batman", "Action, Crime", 7.5f, 2022));

        print(cinemaList);
    }
    public  static void print(List <Cinema> cinema ){
        for (Cinema  c: cinema) {
            System.out.println("\t");
            System.out.print(c);
        }
    }
}