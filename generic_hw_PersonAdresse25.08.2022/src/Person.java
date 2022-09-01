public class Person {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    Adresse adresse;

    public Person(String fName, String lName, String email, String phone, Adresse adresse) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.adresse = adresse;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return  fName + " " +
                lName +" " +
                email + " " +
                phone + " " +
                adresse ;
    }
}
