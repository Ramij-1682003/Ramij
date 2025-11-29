import java.util.Arrays;
public class Cyckle_sort {
    public static void main(String args[]){
        int arr[]={3,5,1,2,4};
        cyckle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyckle_sort(int arr[]){
        
        int i=0;
        while (i<arr.length) {
            if(arr[i]!=arr[arr[i]-1]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
    }
}
