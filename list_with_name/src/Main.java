import java.util.ArrayList;

public class Main {
    /*Дан лист с именами. Необходимо получить лист в
    котором присутствуют имена из исходного листа,
    но только те, что короче 3 символов.*/
    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<String>(5);
        ArrayList<String> finish = new ArrayList<String>();


        arrlist.add("Maximilian");
        arrlist.add("Anna");
        arrlist.add("Ma");
        arrlist.add("Sc");
        arrlist.add("ha");

        for (String str : arrlist) {// for echo loop
            if (str.length() < 3) {
                finish.add(str);
            }
        }

        for (String s : finish) {
            System.out.println(s);
        }

    }
}
