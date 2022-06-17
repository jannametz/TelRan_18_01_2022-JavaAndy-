import java.util.Scanner;
import java.util.Comparator;


public class PrintSort {
    Comparator c;
    public Comparator PrintSort(int wahlenSieBitte) {
        Scanner user = new Scanner(System.in);
        switch (wahlenSieBitte) {
            case 1:
                c = new ComparatorNom();
                break;
            case 2:
                c = new ComparatorGenreCinematographique();
                break;
            case 3:
                c = new ComparatorEvaluation();
                break;
            case 4:
                c = new ComparatorAnnee();
                break;
        }
        return c;
    }
}