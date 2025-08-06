public class n_queens {
    public static boolean issafe(char[][] board, int row, int k) {
        
        // Check vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][k]=='Q'){
            return false;
            }
        }

        // Check left diagonal
         for(int i=row-1,j=k-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
            return false;
            }
        }

        // Check right diagonal

        for(int i=row-1,j=k+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                issafe(board, row, k+1);
                return false;
            }
        }
       return true;
    }
    static int count=0; // To count the number of solutions
    public static void nqueen(char[][] board, int row) {
        
        if(row==board.length){       
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            
            count++;// Increment the count for each solution found
            
            return;
        }
        
        for(int k=0;k<board.length;k++){ //for each column in the row
            if(issafe(board,row,k)){ 
                board[row][k]='Q';
                nqueen(board, row+1);
                board[row][k]='x';   
            }
               
       } 
    }
        
    
    public static void main(String []args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueen(board,0);
        System.out.println("Total solutions: " + count);// Print the total number of solutions found
    }
}
