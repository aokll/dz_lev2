package LinkedList;

public interface LList extends Iterable{
    void add (String val);
  //  boolean add1 (int index, String value);
    boolean remove(String val);
    int size();
    String get (int index);
}
