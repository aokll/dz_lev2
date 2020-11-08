package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
    private Map<String, Set<String>> test;

    public test() {
        this.test = new HashMap<>();
    }

    public void add(String name, String number) {
        if (test.containsKey(name)) {
            test.get(name).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            test.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        if (test.get(name) == null) {
            return new HashSet<>();}

                return test.get(name);
            }
}





