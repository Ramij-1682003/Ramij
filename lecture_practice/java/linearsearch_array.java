import java.util.Scanner;
public class linearsearch_array {
    public static int linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        linear_search(arr, key);
        System.out.println("The element is found at index: " + linear_search(arr, key));

    }
}
