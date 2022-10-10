
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorFromJana implements Collector<BankAccountWithOwner, Map<String, List<String>>, List<PersonWithBankAccounts>> {

    @Override
    public Supplier<Map<String, List<String>>> supplier() {
        return WeakHashMap::new;
    }

    @Override
    public BiConsumer<Map<String, List<String>>, BankAccountWithOwner> accumulator() {
        return (map, o)-> {
            List<String> l = new LinkedList<>();
            l.add(o.getIban());
            map.put(o.getOwners().toString(), l);
        };
    }

    @Override
    public BinaryOperator<Map<String, List<String>>> combiner() {
        return null;
    }

    @Override
    public Function<Map<String, List<String>>, List<PersonWithBankAccounts>> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}

