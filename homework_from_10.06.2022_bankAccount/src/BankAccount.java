
public class BankAccount {
    private String iban_id;
    private double balance;

    public BankAccount(String iban_id, double balance) {
        this.iban_id = iban_id;
        this.balance = balance;
    }

    public String getIban_id() {
        return iban_id;
    }

    public void setIban_id(String iban_id) {
        this.iban_id = iban_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}