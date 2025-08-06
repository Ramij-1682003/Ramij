import java.util.Scanner;
public class Binarysearch {
    public static int binary_search(int arr[],int key){
        int low=0;
        int upper=arr.length-1;
        while(low<=upper){
            int mid=(low+upper)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
            low=arr[mid]+1;
            }
            else if(arr[mid]>key){
                upper=arr[mid]-1;
            }
        
        }
        return -1;
    }
    public static void main(String args[]){
        
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key=sc.nextInt();
        binary_search(arr, key);
        
        if(binary_search(arr, key)!=-1){
            System.out.println("Element found at index: " +binary_search(arr, key));
        }
        else{
            System.out.println("Element is not array");

        }
    }
}
