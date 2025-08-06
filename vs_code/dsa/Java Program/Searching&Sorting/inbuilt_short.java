import java.util.Arrays;
import java.util.Collections;
public class inbuilt_short {
    public static void main(String args[]){
        Integer arr[]={2,70,1,5,55,30,12,0};
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Sorted array in reverse order: "+Arrays.toString(arr));
    }
}
