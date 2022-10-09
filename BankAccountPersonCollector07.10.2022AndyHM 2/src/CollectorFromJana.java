
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorFromJana implements Collector<List<Object>, Map<String, List<String>>, List<Object>> {

    @Override
    public Supplier<Map<String, List<String>>> supplier() {
        return WeakHashMap::new;
    }

    @Override
    public BiConsumer<Map<String, List<String>>, List<Object>> accumulator() {
        return null;
    }

    @Override
    public BinaryOperator<Map<String, List<String>>> combiner() {
        return null;
    }

    @Override
    public Function<Map<String, List<String>>, List<Object>> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}

