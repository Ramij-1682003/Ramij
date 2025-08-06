public class grid_ways {
    //approach 1: Start from(0,0)
    
    // public static int grid(int arr[][],int i,int j){
    // if(i==arr.length-1 && j==arr[i].length-1){
    //     return 1; 
    // }
    // if(i>=arr.length || j>=arr[i].length){
    //     return 0; 
    // }
    // return grid(arr, i+1, j) + grid(arr, i, j+1); // Move down or right
    
    // }
    // public static void main(String[]args){
    //     int arr[][] = new int[3][3];
    //     int i = 0;
    //     int j = 0; // Starting from the bottom right corner
    //     System.out.println(grid(arr, i, j));

    // }
    
    //approach 2: Start from(n-1,m-1)
    // public static int grid2( int n, int m) {
    //     if (n == 0 && m == 0) {
    //         return 1; // Reached the top-left corner
    //     }
    //     if (n < 0 || m < 0) {
    //         return 0; // Out of bounds
    //     }
    //     return grid2( n - 1, m) + grid2( n, m - 1); // Move up or left
    // }
    // public static void main(String[]args){
    //     int arr[][]=new int[4][4];
    //     int n = arr.length;
    //     int m = arr[0].length;
    //     System.out.println(grid2( n-1, m-1));
    // }

    //optimized approach: Using combinatorics
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * fact(n - 1); 
    }
    public static int grid3(int n, int m) {
       if (n <= 0 || m <= 0) {
            return 0; 
        }
        return fact(n + m - 2) / (fact(n - 1) * fact(m - 1));
    }

    public static void main(String[]args){
        int n=3;
        int m=3;
        System.out.println("Number of unique paths: " + grid3(n, m));
    }
}
