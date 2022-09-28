import enums.Kindergarten;

public class Main {
    public static void main(String[] args) {
//@TEST
        Kindergarten kind = Kindergarten.INFANT;
        Kindergarten kind1 = Kindergarten.PRESCHOOL;

        System.out.println("Intfant is " + Kindergarten.INFANT.getYear() + " old. ");
        System.out.println("Intfant go to group " + Kindergarten.INFANT.getGruppe() + ".");
        System.out.println("Preschool children sind " + Kindergarten.PRESCHOOL.getYear() + " old. ");
        System.out.println("Preschool children go to group " + Kindergarten.PRESCHOOL.getGruppe() + ".");
        for(Kindergarten k : Kindergarten.values())
        {
            System.out.print(k + " ");
        }
        System.out.println();
        // Enumeration-Variablen
        /*Kindergarten k1 = Kindergarten.INFANT;
        Kindergarten k2 = Kindergarten.YOUNG_TODDLER;
        Kindergarten k3 = Kindergarten.OLDER_TODDLER;
        Kindergarten k4 = Kindergarten.PRESCHOOL;*/
        // Ausgabe der Werte in Klartext mit toString()
       /* System.out.println("\n" + k1.toString());
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);*/
        // Vergleichen der Werte mittels equals()
        // System.out.println(k1.equals(k4));
        // Hier ist Auslesen der Aufzählungswerte mit erw. for-Schleife
        /*for(Kindergarten k : Kindergarten.values())
        {
            System.out.print(k + " ");
        }
        System.out.println();*/
    }
}

