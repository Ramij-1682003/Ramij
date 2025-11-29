import java.util.*;
public class Bubble_sort_1 {
    public static void main(String[] args) {
        
        // int arr[]={3,1,5,4,2};
        int arr[]={1, 2, 3, 4, 5};
        
        bublesort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void bublesort(int arr[]){        // bubble sort function
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    swap=true;
                }
            }
            if(swap!=true){         // to stop if the array is already sorted
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){       // to swap the two number
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
