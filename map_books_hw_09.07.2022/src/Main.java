import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    /* Дан список Book{String author, String title}.
    Необходимо сформировать map<String, List<String>> ,
    где ключом будет автор, а значением - список книг данного автора. */

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map1 = new HashMap<>();
        List<Book> ListOfBooks = new ArrayList<>();
        ListOfBooks.add(new Book("'Bruce Rowel Douglass,Ph.D.'", "'Agile Systems Engineering.' "));
        ListOfBooks.add(new Book("Martin Aigner", "'Das BUCH der Beweis.'"));
        ListOfBooks.add(new Book("Uwe Schröning", "'Theoretische Informatik. '"));
        ListOfBooks.add(new Book("Hasso Plattner", "'A course in-Memory Data Management.'"));
        ListOfBooks.add(new Book("Christoph Meinel", "'Design Thinking in Education.'"));
        ListOfBooks.add(new Book("Christoph Meinel, tatiana Gayvoronskaya", "'Blockchain.'"));
        ListOfBooks.add(new Book("Thomas Ottmann", "'Algorithmen und Datenstrukturen. '"));

        System.out.println(ListOfBooks);

        for (Book books : ListOfBooks) { //for each
            if (map1.get(books.autor) == null) {
                ArrayList<String> getList = new ArrayList<>();
                getList.add(books.title);
                map1.put(books.autor, getList);
            }

            else { // wir finden hier  Authors
                ArrayList<String> getList = map1.get(books.autor);
                getList.add(books.title);
                map1.put(books.autor, getList);
            }
        }
        System.out.println(map1);
    }

}

