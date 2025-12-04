import java . util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        // int arr[]={4,1,5,2,-1,3,-100};
        int arr[]={1,2,4,3,8,6};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j>0){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
                j--;
            }
        }
    }
}
