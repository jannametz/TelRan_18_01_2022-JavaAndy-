public class Book {


        public String autor;
        public String title;

        public Book(String autor, String title){
            this.autor = autor;
            this.title = title;
        }

    @Override
    public String toString() {

            return "Book --> " + "AUTOR: "
                    + "\033[0;1m" +  autor + " TITLE: "
                    + title  + "\n";
    }
}


