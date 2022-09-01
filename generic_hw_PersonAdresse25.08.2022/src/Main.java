
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    /*
    1. В программе задан список
    Person{ String fName, String lName, String email, String phone, Address address}.
    Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
   	                	-получить список всех ФИО
           	   	    	-получить список всех e-mail
   	                   	-получить список всех телефонов
   	                   	-получить список всех адресов в виде строки адреса
Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра должен приходить список Person и реализация необходимого способа обработки. Ограничения: не использовать стандартные Java интерфейсы, все необходимые классы и интерфейсы описывать и реализовывать самостоятельно. Не использовать stream

    2.Решить задачу №1 в общем виде: т.е. есть список объектов
     типа A необходимо получить список объектов типа B.
     Проверить, получив из листа Person лист объектов Address,
    из листа String лист Integer с длинами строк

*/
    // homework task 1
    public static void main(String[] args) {
        Person p1 = new Person("Anna", "Percy", "annamarchenko@hotmail.com", "030 2621896", new Adresse("14057", "Berlin", "Dernburgstr.", "23"));
        Person p11 = new Person("Percy", "Metz", "percy@hotmail.de", "017620989877", new Adresse("10787", "Berlin", "Burggrafenstr.", "18"));

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p11);

        System.out.println(getMyList(listPerson, l -> String.valueOf(l.getAdresse())));

    }
        public static List<String> getMyList(List<Person> list, InterfacePerson interfacePerson){

            List<String> result = new ArrayList<>();
            list.forEach(person ->result.add(interfacePerson.apply(person)));
            return result;
        }

    }
// homework tast2 I would do next time for  friday ->  02.09.2022