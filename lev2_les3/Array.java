package Collection;
/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать сколько раз встречается каждое слово.

2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
 может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
 выводиться все телефоны.

Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную
запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с
пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
 тестировать просто из метода main() прописывая add() и get().
 */

import java.util.*;

public class Array {
    private static Object String;

    public static void main(String[] args) {
        String[] arr = {"black", "white", "green", "wother", "white", "one", "two", "green", "grenn"};
        List<String> stringList = list(arr);
        Set<String> set = new HashSet<>(stringList);
        System.out.print(set);
        System.out.println("\n");
        System.out.println(map(stringList));
        test t = new test();
        t.add("frank","12345");
        t.add("frank","1");
        System.out.print(t.get("frank"));
    }

    static List<String> list(String[] arr) {
        List<String> stringList = new ArrayList<>();
        for (String str : arr) {
            stringList.add(str);
        }
        return stringList;
    }

    static Map<String, Integer> map(List<String> stringList) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : stringList) {
            if (!stringIntegerMap.containsKey(s)) {
                stringIntegerMap.put(s, 1);
            } else {
                stringIntegerMap.put(s, (stringIntegerMap.get(s) + 1));
            }

        }return stringIntegerMap;
    }
}

