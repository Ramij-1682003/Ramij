import java.util.Scanner;

public class shorted_matrix_search {
    public static void main(String args[]){
        
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        int i=0;
        int j=arr[0].length-1;
        int k=arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be searched :");
        int key = sc.nextInt();
        
        
        while(i<k && j>=0){
            if(arr[i][j]==key){
                System.out.print("Element found at index: "+i+","+j);
                break;
            }
            else if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        if(i==k || j<0){
        System.out.print("Element not found");
        }
    }
}
