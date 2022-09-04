import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
    1. Дан список  BankAccount {Peroson person, String IBAN, double balance).
        Используя stream необходимо вывести на экран все аккаунты, баланс которых составляет менее 100.
    2.  Дан список  BankAccount {Peroson person, String IBAN, double balance),
        Person{String fName, String lName String email)   Используя stream,
        сформировать отсортированный по lName лист строк
        вида “Lennon J.;IBAN: DE19************43;lennon@gmail.com”    (т.е. ФИО; замаскированный счет, в котором открыты только первые 2 и последние 2 символа; email)  для всех клиентов, чей баланс более 100000
     */
    public static void main(String[] args) {
        BankAccount bAcc1 = new BankAccount(new Person("Anna", "Marchenko", "anna.marchenko@hotmail.com"), "DE32 1009 0000 0007 0000 54", 979.99);
        BankAccount bAcc2 = new BankAccount(new Person("Maximilian - Percy", "Metz", "percymetz@hotmail.com"), "DE32 1009 0000 4887 0000 09", 7877765472.44);
        BankAccount bAcc3 = new BankAccount(new Person("Julian", "Waller", "julianwaller@bosten-university.ua"), "DE32 1009 0000 4777 0000 81", 99.99);
        BankAccount bAcc4 = new BankAccount(new Person("Heinrich", "Metz", "heinrichmetz@hotmail.com"), "DE32 1009 0000 9877 0000 01", 987361630174.90);
        BankAccount bAcc5 = new BankAccount(new Person("Mischel - Angelina", "Metz", "mischelmetz@hotmail.com"), "DE32 1009 0000 8877 0000 21", 29.55);

        List<BankAccount> bankAccountNew = new ArrayList<>();
        bankAccountNew.add(bAcc1);
        bankAccountNew.add(bAcc2);
        bankAccountNew.add(bAcc3);
        bankAccountNew.add(bAcc4);
        bankAccountNew.add(bAcc5);

        System.out.println(SummePrint(bankAccountNew, 100));
        System.out.println("------------------------------------------------------");
        System.out.println(BankAccountSortList(bankAccountNew, 100000));


    }
    public static List<BankAccount> SummePrint(List<BankAccount> accountNew, double balance) { // task one
        return accountNew.stream()
                .filter(bAcc -> bAcc.getBalance() < balance)
                .collect(Collectors.toList());
    }
    public static List<String> BankAccountSortList(List<BankAccount> accountNew, double balance) { // task one
        return accountNew.stream()

                .filter(bAcc -> bAcc.getBalance() > balance)
                .sorted(Comparator.comparing(c -> c.getPerson().getlName()))
                .map(c -> c.person.getlName()
                        + " "
                        + c.person.getfName().strip().substring(0,1) // Abkürzung  "s" von Stream // substring erste Buchstabe von firstName
                        + " -> "
                        + "IBAN:" + c.getIBAN().strip().substring(0, 4)
                        + "************" + c.getIBAN().strip().substring(c.getIBAN().length() - 2) // StringUtils class strip() Methode
                        + " -> "
                        + c.person.getEmail())
                .collect(Collectors.toList());

    }
}
