import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;



public class Testing {
    @Test
    public void getMap() {
        Person p1 = new Person("Maximilian Percy");
        Person p2 = new Person("Ola");
        Person p3 = new Person("Armando");

        List<BankAccountWithOwner> accounts = List.of(new BankAccountWithOwner(p1, "DE35 9039 2434 912 09980"),
                (new BankAccountWithOwner(p2, "DE35 9039 2434 912 09981")),
                (new BankAccountWithOwner(p3, "DE35 9039 2434 912 09989")));

        Person p11 = new Person("Maximilian Percy");
        Person p22 = new Person("Ola");
        Person p33 = new Person("Armando");

            List<PersonWithBankAccounts>list = List.of(
                new PersonWithBankAccounts("Maximilian Percy", List.of("DE35 9039 2434 912 09981")),
                new PersonWithBankAccounts("Ola", List.of("DE35 903912434 912 09989")),
                new PersonWithBankAccounts("Armando", List.of("DE35 9039 2434 912 09980")));
        assertEquals(list, Main.getPersonsWithBankAccountList(accounts));

        }
}

