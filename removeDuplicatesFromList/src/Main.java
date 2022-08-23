import  java.util.*;
 /*Реализовать метод который из листа любого типа удаляет
  дубликаты, при этом сохраняя порядок элементов.*/

public class Main {
    public static void main(String[] args) {
// Ввод списка
List<String> listDublicates = new ArrayList<>(Arrays.asList("Anna", "Percy", "Percy", "Anna","Tom", "Tom"));
// Конструируем множества из элементов списка
     Set<String> seting = new LinkedHashSet<>(listDublicates);
     //Из элементов  новый список создать и вывести
List<String> listnoDublicates = new ArrayList<>(seting);

     System.out.println(listDublicates);
     System.out.println(listnoDublicates);
    }
}