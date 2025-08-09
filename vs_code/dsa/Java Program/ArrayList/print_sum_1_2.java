import java.util.ArrayList;
import java.util.Arrays;

public class print_sum_1_2 {
    public static int[] print_sum(ArrayList<Integer> list ,int target){
        int i=0;
        int j=list.size()-1;
        
        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(sum==target){
                return new int[] {list.get(i), list.get(j)};
            }
            if(sum<target){
                i++;
            }else{
                j--;
            }
            
        }
        // Return an empty array if no pair is found
        return new int[0];
    }
    
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        int q[]= print_sum(list, target);
        System.out.println(Arrays.toString(q));
        
    }
}       
