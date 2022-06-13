import java.awt.*;
import java.util.*;
import java.util.List;
/*Given a list of Person (String name, List<BankAccount> accounts).
BankAccount is the class with following fields: String iban,
double balance. Create class BankAccountWithOwner
(Person owner, String iban, double balance).
Implement the method that returns the List of BankAccountWithOwner.*/
public class Main {
    public static void main(String[] args) {
        Person kundeOne = new Person("PERCY MAX", new LinkedList<>());
        Person kundeTwo = new Person("LEO GEORG", new LinkedList<>());
        Person kundeThree = new Person("ANGELINA", new LinkedList<>());
        Person kundeFour = new Person("ANNA MARIE", new LinkedList<>());
        BankAccount accountOne = new BankAccount("DE17 8600 0000 0086 0010 30", 1899000.0);
        BankAccount accountTwo = new BankAccount("DE17 8600 0000 0086 0010 30", 4000.0);
        BankAccount accountThree = new BankAccount("DE35 1630 0700 0086 7929 16", 17000.0);
        BankAccount accountFour = new BankAccount("DE35 1630 0700 0086 7929 16", 400.0);
        BankAccount accountFive = new BankAccount("DE90 9700 5978 5500 0000 00", 67840.37);
        BankAccount accountSex = new BankAccount("DE90 9700 5978 5500 0000 00", - 1000.37);
        BankAccount accountSeven = new BankAccount("DE90 9700 5978 5500 0000 00", - 40.37);
        kundeOne.accounts.add(accountOne);
        kundeTwo.accounts.add(accountTwo);
        kundeTwo.accounts.add(accountThree);
        kundeFour.accounts.add(accountFour);
        kundeThree.accounts.add(accountFive);
        kundeTwo.accounts.add(accountSex);
        kundeFour.accounts.add(accountSeven);
        kundeOne.allBankAccountOwner(kundeOne);
        kundeTwo.allBankAccountOwner(kundeTwo);
        kundeThree.allBankAccountOwner(kundeThree);
        kundeFour.allBankAccountOwner(kundeFour);
    }


}