
import java.util.List;

public class PersonWithBankAccounts {
    private String name;
    List<String> ibans;

    public PersonWithBankAccounts(String name, List<String> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    public String getName() {
        return name;
    }

    public List<String> getIbans() {
        return ibans;
    }

    @Override
    public String toString() {
        return "PersonWithBankAccounts: " + name + ibans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonWithBankAccounts)) return false;

        PersonWithBankAccounts go = (PersonWithBankAccounts) o;

        if (name != null ? !name.equals(go.name) : go.name != null) return false;
        return ibans != null ? ibans.equals(go.ibans) : go.ibans == null;
    }
}



