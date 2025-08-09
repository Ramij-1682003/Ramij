import java.util.*;

public class multidimention_arraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);   list2.add(2);   list3.add(3);  
        list1.add(2);   list2.add(4);   list3.add(6);
        list1.add(3);   list2.add(6);   list3.add(9);
        list1.add(4);   list1.add(6);   list3.add(12);
        list1.add(5);   list2.add(10);  list3.add(15);
        
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

    }
}
