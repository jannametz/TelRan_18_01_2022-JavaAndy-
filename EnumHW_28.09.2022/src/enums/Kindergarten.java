package enums;

public enum Kindergarten {
    INFANT(1, "K0"),
    YOUNG_TODDLER(3, "K1"),
    OLDER_TODDLER(4, "K2"),
    PRESCHOOL(5, "K3");

    private int year;
    private String gruppe;

    private Kindergarten(int year, String gruppe) {
        this.year = year;
        this.gruppe = gruppe;
    }
    public String getGruppe(){
        return this.gruppe;
    }
    public int getYear(){
        return this.year;
    }

}
