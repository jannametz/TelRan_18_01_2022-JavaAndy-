public class Cinema {
    private String name;
    private String genre;
    private int jahr;
    private double evaluation ;


    public Cinema(String name, String genre, double evaluation, int jahr) {
        this.name = name;
        this.genre = genre;
        this.evaluation = evaluation;
        this.jahr = jahr;
    }
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }


    public int getJahr() {
        return jahr;
    }

    public double getEvaluation() {
        return evaluation;
    }


    @Override
    public String toString() {
        return "\033[0;1m" + "Name: " + name + "\tJahr: " + "("+jahr+") " + "\tGenge: "+ genre  + " \tEvaluation: " + evaluation;
    }
}



