package LinkedList;

public class MostImportantClass {
    public static void main(String[] args){
        LList list = new Worksheet();
        list.add("корова");
        list.add("бык");
        list.add("коза");
        list.add("овца");
        list.add("свинья");

       // list.add1(3, "das");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("количество элементов " + list.size());
        //boolean remove = list.remove("бык");
        //System.out.println("удаление " + remove);


        System.out.println(list);
        System.out.println("количество элементов " + list.size());
        System.out.println("Элемент с таким индексом " + list.get(1));


        System.out.println("количество элементов " + list.size());

    }
}
