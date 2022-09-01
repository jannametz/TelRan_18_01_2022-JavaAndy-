public class Adresse {
    private String postcode;
    private String city;
    private String street;
    private String house;

    public Adresse(String postcode, String city, String street, String house) {
        this.postcode = postcode;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return  postcode + " "+ city +" " + street +" "+ house;
    }
}
