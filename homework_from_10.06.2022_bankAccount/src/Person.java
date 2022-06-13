import java.util.*;

public class Person implements BankAccountWithOwner {
    String name;
    LinkedList<BankAccount> accounts;
    //LinkedList<BankAccount> accounts = new LinkedList<BankAccount>();

    public Person(String name, LinkedList<BankAccount> accounts) {
        this.accounts = accounts;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}