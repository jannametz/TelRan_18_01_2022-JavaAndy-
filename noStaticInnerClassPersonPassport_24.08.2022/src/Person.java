import java.util.*;

public class Person {
    private final String firstName;
    private final String lastName;
    private int passport;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'';
    }
    private int passportID(int number) {
        passport = number;
        return passport;
    }
        public class Passport {   //inner not Static class passport
            private String owner;
            private int number;

    public Passport(String owner, int number){
            this.owner = owner;
            this.number = number;
        }
            public Passport(int number){// können wir von unterschiedliche prive Pola account aufzurufen
            this.number = number;
            this.owner=Person.this.lastName;

            }
            @Override
            public String toString() {
                return "Passport{" + "Owner='" + owner + '\'' +
                        ", Number='" + number + '\'' + '}';
            }

            public int passportID(int number) {
                return Person.this.passportID(number);
            }
        }
}
