import java.util.*;
public class Linkedlist_using_frameworks {
    public static void main(String args[]){
        LinkedList<Integer> list= new LinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }

}
