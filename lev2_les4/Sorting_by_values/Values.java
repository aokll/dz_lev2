package Sorting_by_values;

import java.util.Comparator;
import java.util.Map;

public class Values implements Comparator<String> {
    private  final Map<String,Integer>map;

    public Values(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        return map.get(o1) - map.get(o2);
    }
}
