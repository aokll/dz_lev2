package Sorting_by_values;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {
    public static void main(String[] args){
        Map<String,Integer> map = new TreeMap<>();

        map.put("Frank",34);
        map.put("Jonny",23);
        map.put("Ash",12);
        map.put("Max",13);
        map.put("Bard",8);

        Comparator comparator = new Values(map);
        Map<String,Integer> map1 = new TreeMap<>(comparator);
        map1.putAll(map);
        System.out.print(map1);
    }
}
