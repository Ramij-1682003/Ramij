import java.util.*;
public class two_d_array {
    public static void main(String args[]){
        int arr[][]=new int[3][3];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){          //  row travarse
            for(int j=0;j<arr[i].length;j++){  // column traverse
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++){          //  row
            for(int j=0;j<arr[i].length;j++){  // column
                System.out.print(arr[i][j]+" ");
            }
            
            
            System.out.println();
        }
    
    
            //Search a key in array
            int key = 5;
            for(int i=0;i<arr.length;i++){          //  row travarse
                for(int j=0;j<arr[i].length;j++){  // column traverse
                if(arr[i][j]==key){
                    System.out.println("Found at " +i+" "+j);
                    break;
                }
                else{
                    System.out.println("Not Found");
                    
                }
            }
    
    }

}
}