package LinkedList;

import java.util.NoSuchElementException;

public class Worksheet implements LList {
    private Node first;
    private Node lost;
    private int size = 0;

    @Override
    public void add(String val) {
        if (first == null){
            first = new Node(val);
        }else{
        add(first,val);}
        size++;
    }
    private void add (Node current, String val){
     if(current.next == null){
         current.next = new Node(val);
         return;
     }
     add(current.next,val);
    }


    @Override
    public boolean remove(String val) {
        if(first.val.equals(val)){
            first = first.next;
            size--;
            return true;
        }
        Node prev = first;
        Node current = first.next;
        while (current != null){
            if (current.val.equals(val)){
                prev.setNext(current.next);
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Worksheet{" +
                "first=" + first +
                '}';
    }
    @Override
    public int size() {
      /*  int i = 0;
        Iterator iterator = iterator();
        while (iterator.hasNext()){
            i++;
        }
        return i;*/
        return size;
    }

    private boolean checkIndexToRange(int index){
        return index >= 0 && index < this.size;
    }
    @Override
    public String get(int index) {
        String result;
        if(checkIndexToRange(index)){
            result = getLinkByIndex(index).val;
        }else {
            throw new NoSuchElementException();
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return  new SFIterator(first);
    }

    private static class Node{
        private String val;
        private Node next;
        private Node previus;

        public Node(String val) {this(val, null,null); }

        public Node(String val, Node next, Node previus) {
        this.val = val;
        this.next = next;
        this.previus = previus;
        }

        public void setNext(Node next){this.next = next;}

        @Override
        public String toString() {
            return "Node{" + "previus='" + previus + '\'' +
                    "val='" + val + '\'' +
                    ", next=" + next +
                    '}';
        }
    }
    private Node getLinkByIndex (int index){
        Node result;
        if (this.size >> 1 >= index){
            result = this.first;
            for (int i = 0; i < index; i++){
                result = result.next;
            }
        }else {
            result = this.lost;
            for (int i = this.size - 1; i > index; i--){
                result = result.previus;
            }
        }
        return result;
    }



    public static class SFIterator implements Iterator{
        private  Node current;
        public SFIterator(Node current){this.current=current;}
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String val = current.val;
            current = current.next;
            return val;
        }
    }
    /*public boolean add1 (int index,String value){
        boolean result = true;
        if(index == this.size){
            add(value);
        }else if(checkIndexToRange(index)){
            Node oldElement = getLinkByIndex(index);
            Node newElement = new Node(value,oldElement,oldElement.previus);
            if(oldElement.previus == null){
                this.first = newElement;
                this.lost = oldElement;
            }else {
                oldElement.previus.next = newElement;
                oldElement.previus = newElement;
            }this.size++;
        }else {result = false;}
        return  result;
    }*/

}

