import java.util.*;
public class spiral_matrix {
public static void main(String args[]){
                int arr[][]={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                };


                int top=0;
                int bottom=arr.length-1;
                int right=arr[0].length-1;
                int left=0;
                
                while(top<=bottom && left<right){
                    for(int j=left;j<=right;j++){
                        System.out.print(arr[top][j]+" ");
                    }
                        
                    for(int i=top+1;i<=bottom;i++){
                        System.out.print(arr[i][right]+" ");
                    }
                    
                    for(int j=right-1;j>=left;j--){
                        System.out.print(arr[bottom][j]+" ");
                    }
                    
                    for(int i=bottom-1;i>top;i--){
                        System.out.print(arr[i][left]+" ");
                    }
                    top++;
                    bottom--;
                    left++;
                    right--;
                }
                
            }
        }


