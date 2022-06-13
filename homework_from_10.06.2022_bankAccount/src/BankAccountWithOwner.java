import java.util.LinkedList;

public interface BankAccountWithOwner {
    //Person owner;
    // String iban;
    //double balance;
    default void allBankAccountOwner(Person n) {
        System.out.print("\n");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (BankAccount zeiger : n.accounts) {
            System.out.println("Bank account details: " + n.getName() + " --> IBAN: " + zeiger.getIban_id() + " " + ", Balance: " + (zeiger.getBalance()) + " $");
        }
    }
}