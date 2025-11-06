import java.util.*;
public class union_intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        // union
        // for(int i:arr1){
        //     set.add(i);
        // }
        // for(int i:arr2){
        //     set.add(i);
        // }
        // System.out.println(set);
        
        // intersection
        for(int i:arr1){
            set.add(i);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                set2.add(arr2[i]);
            }
        }
        System.out.println(set2);
    }
}
