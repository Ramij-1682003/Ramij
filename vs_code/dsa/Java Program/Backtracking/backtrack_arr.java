public class backtrack_arr {
    public static void backtrack(int arr[],int i,int n){
        if(i==arr.length){
            printarr(arr); //print the backtrack(arr,i+1,n+1) part.
            return;
        }
       arr[i]=n;
       backtrack(arr, i+1, n+1);
       arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main(String []args){
            int arr[]=new int [5];
            backtrack(arr, 0, 1);
            printarr(arr); //print the backtrack part.
        }
    
}